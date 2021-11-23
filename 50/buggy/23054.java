public void setUserInfo(com.scxrh.amb.model.UserInfo userInfo) {
    if (userInfo == null) {
        return ;
    }
    this.userInfo = userInfo;
    notify("userInfo", userInfo);
}