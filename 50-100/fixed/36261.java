public org.anjocaido.groupmanager.data.User createUser(java.lang.String userName) {
    if (getUsers().containsKey(userName.toLowerCase())) {
        return null;
    }
    org.anjocaido.groupmanager.data.User newUser = new org.anjocaido.groupmanager.data.User(this, userName);
    newUser.setGroup(groups.getDefaultGroup(), false);
    addUser(newUser);
    setUsersChanged(true);
    return newUser;
}