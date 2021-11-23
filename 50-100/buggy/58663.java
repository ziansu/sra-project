private void sendMessage(java.lang.String text) {
    MsgUser u = ((MsgUser) (buddiesList.getSelectedItem()));
    u.receiveMessage(((("[" + (myUser.toString())) + "] ") + text));
    textArea.append(MsgWindow.PROMPT);
}