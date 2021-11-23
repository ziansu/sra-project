@java.lang.Override
public void done(java.util.List<com.avoscloud.leanchatlib.utils.ThirdPartUserUtils.ThirdPartUser> userList, java.lang.Exception e) {
    if ((null == e) && (null != userList)) {
        for (com.avoscloud.leanchatlib.utils.ThirdPartUserUtils.ThirdPartUser user : userList) {
            com.avoscloud.leanchatlib.utils.ThirdPartDataCache.getInstance().cacheUser(user.userId, user);
        }
    }
}