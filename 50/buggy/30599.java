public boolean checkUsernameExists(java.lang.String userId) {
    return (registerDao.checkUserIdExists(userId)) > 0;
}