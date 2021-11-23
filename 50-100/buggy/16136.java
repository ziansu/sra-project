public boolean handleLogInRequest(java.lang.String id, java.lang.String password) {
    javathehutt.buzz_movieselector.model.User u = javathehutt.buzz_movieselector.model.UserMapManager.userMap.get(id);
    if ((((javathehutt.buzz_movieselector.model.UserMapManager.currentUser) == null) && (u != null)) && (u.logIn(password))) {
        javathehutt.buzz_movieselector.model.UserMapManager.currentUser = u;
        return true;
    }
    return false;
}