@java.lang.Override
public void modifyUser(myddl.service.impl.UserPassword userPassword, myddl.service.impl.UserInfo userInfo) {
    if (userPassword != null) {
        userPasswordMapper.updateByPrimaryKeySelective(userPassword);
    }
    userInfoMapper.updateByPrimaryKeySelective(userInfo);
}