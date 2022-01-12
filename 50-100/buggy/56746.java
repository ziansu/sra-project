public void readGeneralOptions(java.lang.String filename) {
    try {
        org.ini4j.Ini prefs = new org.ini4j.Ini(new java.io.File(filename));
        this.iniFilename = filename;
        if ((prefs.get("ProxyWorkerManager", "torRangeStart")) != null) {
            com.object0r.TorRange.ProxyWorkerManager.torRangeStart = java.lang.Integer.parseInt(prefs.get("ProxyWorkerManager", "torRangeStart"));
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.exit(0);
    }
}