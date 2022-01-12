public void run() {
    try {
        pluginManager.load();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    fileManager.loadSecondarySettings();
}