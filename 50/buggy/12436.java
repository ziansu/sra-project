public java.lang.String getLoginInfoParams(java.lang.String key) {
    android.content.SharedPreferences sharedPreferences = getSharedPreferences("loginInfo", Context.MODE_PRIVATE);
    return sharedPreferences.getString(key, "");
}