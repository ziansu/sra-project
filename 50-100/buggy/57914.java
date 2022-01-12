private org.pentaho.metastore.persist.MetaStoreFactory<org.pentaho.big.data.impl.cluster.NamedClusterImpl> getMetaStoreFactory(org.pentaho.metastore.api.IMetaStore metastore) {
    org.pentaho.metastore.persist.MetaStoreFactory<org.pentaho.big.data.impl.cluster.NamedClusterImpl> namedClusterMetaStoreFactory = factoryMap.get(metastore);
    if (namedClusterMetaStoreFactory == null) {
        if (metastore instanceof org.pentaho.di.core.attributes.metastore.EmbeddedMetaStore) {
            namedClusterMetaStoreFactory = new org.pentaho.metastore.persist.MetaStoreFactory(org.pentaho.big.data.impl.cluster.NamedClusterImpl.class, metastore, org.pentaho.di.trans.steps.named.cluster.NamedClusterEmbedManager.NAMESPACE);
        }else {
            namedClusterMetaStoreFactory = new org.pentaho.metastore.persist.MetaStoreFactory(org.pentaho.big.data.impl.cluster.NamedClusterImpl.class, metastore, org.pentaho.metastore.util.PentahoDefaults.NAMESPACE);
        }
        factoryMap.put(metastore, namedClusterMetaStoreFactory);
    }
    return namedClusterMetaStoreFactory;
}