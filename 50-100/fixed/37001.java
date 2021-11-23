@java.lang.Override
public io.rong.imlib.model.UserInfo getUserInfo(java.lang.String userId) {
    try {
        org.xutils.DbManager dbManager = cn.ahyxy.fastvisit.app.AppContext.getDbmanager();
        cn.ahyxy.fastvisit.app.ui.friend.model.Friend friend = dbManager.findById(cn.ahyxy.fastvisit.app.ui.friend.model.Friend.class, userId);
        if (friend == null) {
            return null;
        }
        io.rong.imlib.model.UserInfo userInfo = new io.rong.imlib.model.UserInfo(friend.getUserId(), friend.getNickname(), android.net.Uri.parse(friend.getPortrait()));
        return userInfo;
    } catch (org.xutils.ex.DbException e) {
        e.printStackTrace();
    }
    return null;
}