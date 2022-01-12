private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws java.io.IOException {
    java.lang.String text = clientInputText.getText();
    if (text != "") {
        this.client.connect(text);
        clientTextIncome.append(((client.getResponse()) + "\n"));
    }
}