protected void createUser(java.lang.String username, java.lang.String password) {
    com.example.root.quiettime.User user = new com.example.root.quiettime.User();
    user.name = username;
    user.pw = password;
    storeUser(user);
}