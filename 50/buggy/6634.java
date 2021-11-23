@java.lang.Override
public void init() throws java.lang.Exception {
    address.MainApp.logger.info("Initializing app ...");
    super.init();
    initComponents();
    initConfig();
    initPrefs();
    address.browser.BrowserManager.initializeBrowser();
}