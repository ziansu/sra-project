private com.molina.cvmfs.catalog.Catalog getOpenedCatalogForPath(java.lang.String path) {
    com.molina.cvmfs.catalog.Catalog bestCatalog = retrieveRootCatalog();
    int maxLength = 0;
    for (com.molina.cvmfs.catalog.Catalog catalog : openedCatalogs.values()) {
        int currentLength = path.indexOf(catalog.getRootPrefix());
        if (currentLength > maxLength) {
            bestCatalog = catalog;
        }
    }
    return bestCatalog;
}