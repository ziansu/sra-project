public static net.sf.sahi.client.Browser getBrowser(java.lang.String browserName) {
    java.lang.String browserHost = reservaCanchas.common.Config.getConfig().getProperty("browser.host");
    java.lang.String browserPort = reservaCanchas.common.Config.getConfig().getProperty("browser.port");
    net.sf.sahi.client.Browser browser = new net.sf.sahi.client.Browser(browserName, browserHost, java.lang.Integer.parseInt(browserPort));
    reservaCanchas.common.Functions.closeBrowserInstance(browser, browserName);
    browser.open();
    browser.navigateTo(reservaCanchas.common.Config.getServer().toString());
    return browser;
}