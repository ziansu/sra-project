public boolean checkUser(com.smf.main.model.User user) {
    com.smf.main.entities.UserEntity foundUser = userDao.findByUserNameAndPassword(user.getUserName(), user.getPassword());
    return foundUser == null ? false : true;
}