public void sendText() {
    if (!(this.textField.getText().equals(""))) {
        try {
            server.sendToBroadcast((((de.eschoenawa.lanchat.Config.load().getName()) + ": ") + (this.textField.getText())));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        this.textField.setText("");
        this.textField.requestFocusInWindow();
    }
}