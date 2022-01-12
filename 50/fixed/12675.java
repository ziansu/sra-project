public void install() throws java.lang.Exception {
    uninstall();
    extractZip();
    if ("-".equals(installed)) {
        addonSettings.refresh();
    }
}