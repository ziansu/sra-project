@java.lang.Override
public cn.momia.api.user.dto.User getByInviteCode(java.lang.String inviteCode) {
    java.lang.String sql = "SELECT Id FROM SG_User WHERE InviteCode=? AND Status<>0";
    java.util.List<java.lang.Long> userIds = queryLongList(sql, new java.lang.Object[]{ inviteCode });
    java.util.List<cn.momia.api.user.dto.User> users = list(userIds);
    return users.isEmpty() ? cn.momia.api.user.dto.User.NOT_EXIST_USER : users.get(0);
}