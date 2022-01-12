@java.lang.SuppressWarnings(value = "unchecked")
private java.util.List<org.apache.oodt.cas.filemgr.structs.Product> getProductsFromCache(java.lang.String productTypeId) {
    java.util.List<org.apache.oodt.cas.filemgr.structs.Product> products = null;
    if ((org.apache.oodt.cas.filemgr.catalog.DataSourceCatalog.PRODUCT_CACHE.get(productTypeId)) == null) {
        return null;
    }else {
        java.util.TreeMap<java.lang.String, java.lang.Object> productListAndUpdateTime = org.apache.oodt.cas.filemgr.catalog.DataSourceCatalog.PRODUCT_CACHE.get(productTypeId);
        products = ((java.util.List<org.apache.oodt.cas.filemgr.structs.Product>) (productListAndUpdateTime.get("productList")));
    }
    return products;
}