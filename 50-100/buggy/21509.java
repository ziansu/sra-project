public static void openPage(java.lang.String url) {
    utils.Base.getInstance().manage().timeouts().pageLoadTimeout(Constant.TIMEOUT_IN_SECONDS, java.util.concurrent.TimeUnit.SECONDS);
    utils.Base.getInstance().get(url);
    utils.Actions.waitForUrlToContain(url);
    utils.TestReport.addLog(LogStatus.INFO, ("Opened page " + url));
}