public java.util.List<java.net.URL> getManagedURLs() {
    java.util.List<java.net.URL> managedURL = getJarFileUrls();
    if ((managedURL == null) && (!(getExcludeUnlistedClasses()))) {
        managedURL = new java.util.ArrayList<java.net.URL>(1);
        managedURL.add(getPersistenceUnitRootUrl());
    }
    return managedURL;
}