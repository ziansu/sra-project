protected static void addLoggedUser(java.lang.String jwt, com.sciamlab.auth.model.User user) {
    com.sciamlab.auth.dao.SciamlabLocalUserDAO.LOGGED_USERS.put(jwt, user);
    com.sciamlab.auth.dao.SciamlabLocalUserDAO.LOGGED_USERS_REVERSE.put(user.id(), jwt);
}