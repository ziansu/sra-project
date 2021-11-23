public void changeUserPassword(net.greatstart.model.User user, java.lang.String password) {
    user.setPassword(password);
    userDao.save(user);
}