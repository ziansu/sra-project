@java.lang.Override
public void failed(java.lang.Throwable e, org.junit.runner.Description description) {
    org.maxwu.jrefresh.ColorPrint.println_blue((("Case " + (description.getMethodName())) + " fails."));
    if ((org.maxwu.jrefresh.selenium.ScreenshotWatcher.page) != null) {
        org.maxwu.jrefresh.selenium.ScreenshotWatcher.page.saveScreenShot();
    }
}