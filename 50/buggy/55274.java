public void addUserToList(java.lang.String userName) {
    chatBoxUserListGui.setUserListTextArea((((chatBoxUserListGui.getUserListTextArea().getText()) + "\n ") + userName));
}