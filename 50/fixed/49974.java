@java.lang.Override
public boolean isExistingUserName(java.lang.String userName) throws java.lang.NullPointerException {
    if (userName == null) {
        throw new java.lang.NullPointerException();
    }
    return userDao.isExistingUserName(userName);
}