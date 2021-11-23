public com.witvan.wechat.domain.UserInfo getUserInfoByUserId(java.lang.String userId) {
    if (userId == null) {
        return null;
    }
    java.util.Collection<com.witvan.wechat.domain.UserInfo> infos = users.values();
    java.lang.String openId = "";
    for (com.witvan.wechat.domain.UserInfo info : infos) {
        if (userId.equalsIgnoreCase(info.getCustomId())) {
            return this.getUserInfo(openId);
        }
    }
    return null;
}