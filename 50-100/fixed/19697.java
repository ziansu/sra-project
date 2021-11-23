public org.eclipse.osgi.storage.bundlefile.BundleFile getBundleFile() {
    synchronized(genMonitor) {
        if ((bundleFile) == null) {
            if ((getBundleId()) == 0) {
                bundleFile = new org.eclipse.osgi.storage.SystemBundleFile();
            }else {
                bundleFile = getStorage().createBundleFile(content, this, isDirectory, true);
            }
        }
        return bundleFile;
    }
}