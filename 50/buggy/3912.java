public boolean isUrlPathEqualTo(java.lang.String path) {
    java.lang.String currentPath = new com.wikia.webdriver.common.core.urlbuilder.UrlBuilder().getUrlPath(driver);
    return currentPath.equalsIgnoreCase(path);
}