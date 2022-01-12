public java.lang.String getLoginInfoParams(java.lang.String key) {
    android.content.SharedPreferences sharedPreferences = this.getSharedPreferences("loginInfo", Context.MODE_PRIVATE);
    return sharedPreferences.getString(key, "");
}