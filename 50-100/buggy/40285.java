private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String text = clientInputText.getText();
    this.client = new clientserverchat.CClient("192.168.1.37", "5555");
    if (text != "") {
        this.client.connect(text);
        clientTextIncome.append(((client.getResponse()) + "\n"));
    }
}