public synchronized java.util.Vector<java.lang.String> getAndCleanFresh() {
    java.util.Vector<java.lang.String> returnVector = this.freshUrls;
    com.object0r.scanners.ShodanScanner.ShodanWorkerManager.freshUrls = new java.util.Vector<java.lang.String>();
    return returnVector;
}