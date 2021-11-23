private void checkUsername(com.musicforall.model.User user) {
    java.lang.String searchUsername;
    final java.lang.String username = user.getUsername();
    searchUsername = username;
    int i = 0;
    while ((userService.getIdByUsername(searchUsername)) != null) {
        i++;
        searchUsername = username + i;
    } 
    if (i > 0) {
        user.setUsername(searchUsername);
    }
}