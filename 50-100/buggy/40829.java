private void Send_BtnActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        java.lang.String Message = Message_Field.getText();
        java.lang.String Destination = Keterangan_Label.getText();
        java.lang.String OutputString = ((("<USER>-" + Destination) + "-") + Message) + "\r\n";
        SendMessage(OutputString);
        writelog(("You said : " + Message));
        Message_Field.setText("");
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Client gagal mengirim data\n");
        java.lang.System.exit(1);
    }
}