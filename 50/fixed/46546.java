@java.lang.Override
public com.sciamlab.auth.model.User validate(java.lang.String jwt) {
    com.sciamlab.auth.model.User u = com.sciamlab.auth.dao.SciamlabLocalUserDAO.LOGGED_USERS.get(jwt);
    return u;
}