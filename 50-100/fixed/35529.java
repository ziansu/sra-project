public void initConnect() {
    try {
        if ((engine) == null) {
            java.lang.String serverAdress = serverAdressField.getText();
            int port = java.lang.Integer.parseInt(serverPortField.getText());
            engine = new igor.korobeynikov.Engine(serverAdress, port, this);
        }
    } catch (java.lang.NumberFormatException e) {
        textAreaChat.appendText("Введен не корректный порт");
    }
}