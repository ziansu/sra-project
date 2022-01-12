private void checkUsername(com.musicforall.model.User user) {
    java.lang.String searchUsername;
    java.lang.String username = searchUsername = user.getUsername();
    int i = 0;
    while ((userService.getIdByUsername(searchUsername)) != null) {
        i++;
        searchUsername = username + i;
    } 
    if (i > 0) {
        user.setUsername(searchUsername);
    }
}