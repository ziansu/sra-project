private void sendMessage(java.lang.String text) {
    MsgUser u = ((MsgUser) (buddiesList.getSelectedItem()));
    textArea.append(MsgWindow.PROMPT);
    u.receiveMessage(((("[" + (myUser.toString())) + "] ") + text));
}