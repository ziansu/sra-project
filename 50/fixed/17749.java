public void removeUserFromList(java.lang.String userName) {
    chatBoxUserListGui.setUserListTextArea(chatBoxUserListGui.getUserListTextArea().getText().replace((userName + "\n"), ""));
}