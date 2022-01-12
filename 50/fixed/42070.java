public synchronized java.util.Vector<java.lang.String> getAndCleanFresh() {
    java.util.Vector<java.lang.String> returnVector = new java.util.Vector<java.lang.String>(com.object0r.scanners.ShodanScanner.ShodanWorkerManager.freshUrls);
    com.object0r.scanners.ShodanScanner.ShodanWorkerManager.freshUrls = new java.util.Vector<java.lang.String>();
    return returnVector;
}