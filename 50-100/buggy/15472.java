@java.lang.Override
public void setMessage(java.lang.String message) {
    super.setMessage(message);
    if ((message != null) && ((message.length()) > 0)) {
        table.setVisible(false);
    }
    messageLabel.setText(message);
}