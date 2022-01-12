@java.lang.Override
public boolean delete(java.lang.String userEmail) throws ua.artcode.exception.NoSuchUserException {
    ua.artcode.model.common.User user = datastore.find(ua.artcode.model.common.User.class).field("email").equal(userEmail).get();
    if (user != null) {
        datastore.delete(ua.artcode.model.common.User.class, user.getUserName());
        ua.artcode.dao.UserDaoMongoImpl.LOG.info((("User with email -  " + userEmail) + " was deleted from data base."));
    }
    return false;
}