public void onDisable() {
    saveDetectors();
    org.cubeville.itemdetector.ItemDetector.log.info((((("[" + (name)) + "] Version ") + (version)) + " disabled."));
}