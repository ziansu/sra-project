public void install() throws java.lang.Exception {
    uninstall();
    extractZip();
    if (installed.equals("-")) {
        addonSettings.refresh();
    }
}