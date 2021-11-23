@java.lang.Override
public com.ims.domain.User authenticateUser(com.ims.domain.User user) {
    com.ims.domain.User userFromDb = userDAOImpl.getUserByUsername(user.getUsername());
    if ((userFromDb != null) && (user.getPassword().equals(user))) {
        user = userFromDb;
        user.setAuthenticated(true);
        return user;
    }else
        return null;
    
}