public boolean checkUser(com.smf.main.model.User user) {
    return (userDao.findByUserNameAndPassword(user.getUserName(), user.getPassword())) == null ? false : true;
}