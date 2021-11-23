private int isLegal(com.joenee.web.rest.ea.User user, java.lang.String token) {
    int retValue = 3;
    com.joenee.web.rest.ea.UserOnline userOnline = userOnlineService.selectOne(new com.baomidou.mybatisplus.mapper.EntityWrapper<com.joenee.web.rest.ea.UserOnline>().eq("user_id", user.getId()));
    if (userOnline != null) {
        if (isExpire(user)) {
            retValue = 2;
        }else {
            return 1;
        }
    }
    return retValue;
}