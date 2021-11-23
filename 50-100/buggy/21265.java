@java.lang.Override
public beans.UserBean login(java.lang.String username, java.lang.String password) throws business.UserLoginFailedException {
    beans.UserBean user = null;
    try {
        user = userDao.findByLoginDetails(username, password);
        if ((user.getAccessLevel()) == 1) {
            return user;
        }else {
            return null;
        }
    } catch (dao.DataAccessException e) {
        throw new business.UserLoginFailedException("Unable to find user", e);
    }
}