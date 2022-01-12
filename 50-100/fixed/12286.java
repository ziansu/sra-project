private static void sendMessage(javafx.event.ActionEvent e) {
    java.lang.String sender = AsxGame.activePlayer.email;
    java.lang.String recipient = com.amazonaws.samples.UI_Mailbox.toField.getText().toLowerCase();
    java.lang.String subject = com.amazonaws.samples.UI_Mailbox.subjectField.getText();
    java.lang.String body = com.amazonaws.samples.UI_Mailbox.bodyField.getText();
    if (com.amazonaws.samples.Game.sendMessage(sender, recipient, subject, body)) {
        com.amazonaws.samples.UI_Mailbox.toField.setText("");
        com.amazonaws.samples.UI_Mailbox.subjectField.setText("");
        com.amazonaws.samples.UI_Mailbox.bodyField.setText("");
    }else {
        com.amazonaws.samples.UI_Mailbox.toField.setText("Message not sent, sorry!");
    }
}