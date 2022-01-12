private void populateUserNameList() {
    java.util.Collection<objects.databaseObjects.User> userList = util.CacheObject.getUserList();
    java.util.List<java.lang.String> userNameList = new java.util.ArrayList<java.lang.String>();
    for (objects.databaseObjects.User user : userList) {
        userNameList.add(user.getName());
    }
    listUserNames.setListData(userNameList.toArray());
    listUserNames.revalidate();
}