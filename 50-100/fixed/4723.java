private com.metis.meishuquan.model.commons.User getUserInfoFromSharedPreferences() {
    com.metis.meishuquan.util.SharedPreferencesUtil spu = com.metis.meishuquan.util.SharedPreferencesUtil.getInstanse(com.metis.meishuquan.MainApplication.UIContext);
    java.lang.String json = spu.getStringByKey(SharedPreferencesUtil.USER_LOGIN_INFO);
    if (json.isEmpty()) {
        return new com.metis.meishuquan.model.commons.User();
    }
    com.metis.meishuquan.model.login.LoginUserData user = new com.google.gson.Gson().fromJson(json, new com.google.common.reflect.TypeToken<com.metis.meishuquan.model.login.LoginUserData>() {    }.getType());
    return user.getData();
}