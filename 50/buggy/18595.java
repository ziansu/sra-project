@java.lang.Override
public void handle(javafx.event.ActionEvent t) {
    setMode(htmleditor.LinkViewPane.IN_ORDER);
    modeDisplay.setText(createDisplayText());
    update();
}