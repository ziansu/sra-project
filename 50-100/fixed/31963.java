public static java.lang.String getUserInfo(android.content.Context context, java.lang.String key) {
    android.content.SharedPreferences userInfo = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
    if ("userType".equals(key)) {
        return (userInfo.getInt("userType", 0)) + "";
    }else {
        return userInfo.getString(key, "");
    }
}