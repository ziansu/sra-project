public java.lang.String saveUser() {
    userDao.add(user);
    return listUser();
}