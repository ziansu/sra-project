public void sendText() {
    if (!(this.textField.getText().equals(""))) {
        try {
            java.lang.String msg = ((de.eschoenawa.lanchat.Config.load().getName()) + ": ") + (this.textField.getText());
            server.sendToBroadcast(msg);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        this.textField.setText("");
        this.textField.requestFocusInWindow();
    }
}