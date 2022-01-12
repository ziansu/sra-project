@java.lang.Override
public void init() throws java.lang.Exception {
    if (com.teamdev.jxbrowser.chromium.internal.Environment.isMac()) {
        com.teamdev.jxbrowser.chromium.BrowserCore.initialize();
    }
}