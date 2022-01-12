@java.lang.Override
public void changed(javafx.beans.value.ObservableValue ov, javafx.concurrent.Worker.State oldState, javafx.concurrent.Worker.State newState) {
    if (newState == (javafx.concurrent.Worker.State.SUCCEEDED)) {
        netscape.javascript.JSObject win = ((netscape.javascript.JSObject) (webEngine.executeScript("window")));
        win.setMember("app", new browsermator.com.BrowserMatorFileCloud.JavaApp(browser2));
    }
}