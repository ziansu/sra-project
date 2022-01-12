@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((ChatClient.getMessageSpot().getText().length()) > 0) {
        javax.swing.JTextArea messageArea = ChatClient.getMessageSpot();
        if (((messageArea.getText().length()) - 1) > 0) {
            sendMessage(messageArea);
            messageArea.setCaretPosition(0);
        }
    }
}