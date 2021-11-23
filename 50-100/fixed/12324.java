public java.lang.String check() {
    com.zoo.model.User user = userService.findUserById(login);
    if ((user != null) && (user.isMyPassword(pass))) {
        userHolder.setUser(user);
        return java.lang.Boolean.TRUE.toString();
    }else {
        return java.lang.Boolean.FALSE.toString();
    }
}