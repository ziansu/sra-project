@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    getSharedPreferences(Constant.user_Preferences, 0).edit().clear().commit();
}