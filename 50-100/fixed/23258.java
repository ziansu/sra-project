@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    urgencyCom.setItems(urgencyList);
    client.control.Request request = new client.control.Request(Command.GET_EXAMINATION_TYPE, null);
    try {
        ClientConnectionController.clientConnect.controller = this;
        ClientConnectionController.clientConnect.sendToServer(request);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    for (client.control.IUi ui : ClientConnectionController.clientConnect.userInterface) {
        if (ui instanceof client.boundry.CreateLabReferenceUI) {
            thisUi = ui;
        }
    }
}