public modeling.UserInfo login(java.lang.String userName, java.lang.String password) {
    modeling.UserInfo matches = null;
    for (modeling.UserInfo userInfo : userInfoList) {
        if (((userInfo.getUserName()) == userName) && ((userInfo.getPassword()) == password)) {
            matches = userInfo;
        }
    }
    return matches;
}