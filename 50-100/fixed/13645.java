private boolean comparePackageVersions(java.lang.String packageName, org.osgi.framework.Version remoteVersion, org.osgi.framework.Version localVersion) throws java.lang.RuntimeException {
    if (remoteVersion == null)
        remoteVersion = org.osgi.framework.Version.emptyVersion;
    
    if (localVersion == null)
        localVersion = org.osgi.framework.Version.emptyVersion;
    
    int compareResult = localVersion.compareTo(remoteVersion);
    return compareResult != 0;
}