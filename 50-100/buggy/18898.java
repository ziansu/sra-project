private java.util.List<model.User> getUserTypeListCopy(java.lang.Class<? extends model.User> userType) {
    java.util.List<model.User> users = new java.util.ArrayList<>();
    for (int i = 0; i < (myUserList.size()); i++) {
        final model.User currUser = myUserList.get(i);
        if (currUser.getClass().getCanonicalName().equals(userType.getCanonicalName())) {
            users.add(currUser);
        }
    }
    return users;
}