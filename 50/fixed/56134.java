private java.lang.String buildUserInfoDisplay(com.facebook.model.GraphUser user) {
    java.lang.StringBuilder userInfo = new java.lang.StringBuilder("");
    userInfo.append(user.getId());
    return userInfo.toString();
}