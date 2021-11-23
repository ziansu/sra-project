public void initUserCache() {
    ro.fortech.model.User user = null;
    for (int i = 0; i < 10; i++) {
        user = new ro.fortech.model.User();
        user.setCountry("Romania");
        user.setUsername(("user" + i));
        user.setPassword(("pass" + i));
        userCache.getUserCache().put(user.getUsername(), user);
    }
}