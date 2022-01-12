public java.util.List<com.softdesign.devintensive.data.storage.models.User> getUserListByName(java.lang.String query) {
    java.util.List<com.softdesign.devintensive.data.storage.models.User> userList = new java.util.ArrayList<>();
    try {
        userList = mDaoSession.queryBuilder(com.softdesign.devintensive.data.storage.models.User.class).where(UserDao.Properties.Rating.gt(0), UserDao.Properties.SearchName.like((("%" + (query.toUpperCase())) + "%"))).orderDesc(UserDao.Properties.Rating).build().list();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return userList;
}