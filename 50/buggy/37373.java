@java.lang.Override
public void insertUserInfo(com.newbaz.model.UserInfo userInfo) {
    addressDao.insertAddress(userInfo.getAddress());
    userInfoDao.insertUserInfo(userInfo);
}