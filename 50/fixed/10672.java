public void quit() {
    if (removeViewable()) {
        org.infinity.gui.ChildFrame.closeWindows();
        storePreferences();
        org.infinity.NearInfinity.clearCache(false);
        java.lang.System.exit(0);
    }
}