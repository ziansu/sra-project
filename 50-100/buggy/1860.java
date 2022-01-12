private void refreshUserList(java.util.ArrayList<client.User> users) {
    java.util.ArrayList<java.lang.String> userNames = new java.util.ArrayList<java.lang.String>(users.size());
    for (client.User U : users)
        userNames.add(U.getUsername());
    
    GUI.refreshUsers(userNames);
}