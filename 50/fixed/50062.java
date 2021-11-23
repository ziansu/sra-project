@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!(ChatField.getText().equals(""))) {
        c.SendPublicChat(ChatField.getText());
        ChatField.setText("");
    }
}