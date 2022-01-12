private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String msg = txt_send.getText();
    txt_send.setText("");
    if (!(msg.equals(""))) {
        append((("Me : " + msg) + "\n"));
        client.sendTo(msg, lbl_chat.getText());
    }
    if (msg.equals("bye")) {
        append("To re-enter chat room click \'Reconnect\'.\n");
        client.stop();
        btn_reconnect.setEnabled(true);
        return ;
    }
}