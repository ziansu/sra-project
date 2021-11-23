public java.util.Map<java.lang.String, com.easemob.chatuidemo.domain.User> getUserFromDB(android.app.Activity activity) {
    com.easemob.chatuidemo.db.UserDao dao = new com.easemob.chatuidemo.db.UserDao(activity);
    java.util.Map<java.lang.String, com.easemob.chatuidemo.domain.User> userlist = dao.getContactList();
    return userlist;
}