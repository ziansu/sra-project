@java.lang.Override
public void changed(javafx.beans.value.ObservableValue ov, javafx.concurrent.Worker.State oldState, javafx.concurrent.Worker.State newState) {
    if (newState == (javafx.concurrent.Worker.State.SUCCEEDED)) {
        netscape.javascript.JSObject w = ((netscape.javascript.JSObject) (webEngine.executeScript("window")));
        w.setMember("java", javaScriptToJavaBridge);
        setColorPoints(colorPointsStr);
        java.lang.System.out.println("registered JavaScript-to-Java bridge");
    }
}