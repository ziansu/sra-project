@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    customizeEditorPane();
    if ((((message) != null) && (message.getTo().contains("##"))) || (((receiver) != null) && (receiver.contains("##")))) {
        btnSendAttach.setDisable(true);
    }
}