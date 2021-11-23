@java.lang.Override
public boolean isSatisfied() {
    try {
        return !(org.chromium.content.browser.test.util.DOMUtils.isFullscreen(getWebContentsOnUiThread()));
    } catch (java.lang.InterruptedException | java.util.concurrent.TimeoutException e) {
        fail(e.getMessage());
        return false;
    }
}