@java.lang.Override
public void sendToChildren(io.innofang.base.bean.greendao.SMS sms) {
    io.innofang.base.bean.User user = cn.bmob.v3.BmobUser.getCurrentUser(io.innofang.base.bean.User.class);
    java.lang.String username = user.getContact().get(0).getUsername();
    checkConversations(username);
    send(sms);
}