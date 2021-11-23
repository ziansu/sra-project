@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends javafx.concurrent.Worker.State> ov, javafx.concurrent.Worker.State oldState, javafx.concurrent.Worker.State newState) {
    if (newState == (javafx.concurrent.Worker.State.SUCCEEDED)) {
        serverObject = new dwenguinoblocklyarduinoplugin.DwenguinoBlocklyServer(editor, this.getScene().getWindow());
        netscape.javascript.JSObject win = ((netscape.javascript.JSObject) (webEngine.executeScript("window")));
        win.setMember("dwenguinoBlocklyServer", serverObject);
    }else {
    }
}