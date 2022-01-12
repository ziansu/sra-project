private com.molina.cvmfs.catalog.Catalog getOpenedCatalogForPath(java.lang.String path) {
    com.molina.cvmfs.catalog.Catalog bestCatalog = retrieveRootCatalog();
    int maxLength = 0;
    for (com.molina.cvmfs.catalog.Catalog catalog : openedCatalogs.values()) {
        if (((path.indexOf(catalog.getRootPrefix())) == 0) && ((catalog.getRootPrefix().length()) > maxLength)) {
            bestCatalog = catalog;
            maxLength = catalog.getRootPrefix().length();
        }
    }
    return bestCatalog;
}