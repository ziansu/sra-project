@java.lang.Override
public void setMessage(java.lang.String message) {
    super.setMessage(message);
    messagePanel.setVisible(((message != null) && (!(message.isEmpty()))));
    messagePanel.clear();
    if (message != null) {
        messagePanel.add(new com.google.gwt.user.client.ui.Label(message));
    }
}