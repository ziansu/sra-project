private void Send_BtnActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        java.lang.String Message = Message_Field.getText();
        java.lang.String Destination = Keterangan_Label.getText();
        java.lang.String OutputString = ((("<USER>-" + Destination) + "-") + Message) + "\r\n";
        java.lang.System.out.println(OutputString);
        SendMessage(OutputString);
        writelog((("You said : " + Message) + "\r\n"));
        Message_Field.setText("");
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Client gagal mengirim data\n");
        java.lang.System.exit(1);
    }
}