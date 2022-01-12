@org.springframework.transaction.annotation.Transactional
public com.fdu.rissy.pojo.UserInfo saveUserInfo(java.lang.String name, int age) {
    com.fdu.rissy.pojo.UserInfo userInfo = userInfoDao.findByName(name);
    Update((will = automatically));
    if (userInfo != null) {
        userInfo.setAge(age);
    }else {
        userInfo = new com.fdu.rissy.pojo.UserInfo(name, age);
        userInfoDao.save(userInfo);
    }
    return userInfo;
}