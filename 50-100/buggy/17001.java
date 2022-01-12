@java.lang.Override
public void startUp() {
    org.voltdb.catalog.Catalog catalog = edu.brown.catalog.CatalogUtil.loadCatalogFromJar(m_jarFileName);
    org.voltdb.catalog.Site catalog_site = edu.brown.catalog.CatalogUtil.getSiteFromId(catalog, 0);
    assert catalog_site != null;
    edu.brown.hstore.conf.HStoreConf hstore_conf = edu.brown.hstore.conf.HStoreConf.singleton(((edu.brown.hstore.conf.HStoreConf.isInitialized()) == false));
    if ((edu.brown.hstore.HStore.instance()) == null) {
        edu.brown.hstore.HStore.initialize(catalog_site, hstore_conf);
    }
    m_server = new org.voltdb.ServerThread(hstore_conf, catalog_site);
    m_server.start();
    m_server.waitForInitialization();
}