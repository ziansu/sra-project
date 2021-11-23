public void addTestUsers(int times) {
    for (int i = 0; i < times; i++) {
        com.webapp.model.User user = new com.webapp.model.User();
        user.setName(java.lang.Integer.toString(i));
        userDao.save(user);
        idsList.add(user.getId());
    }
}