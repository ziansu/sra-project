public com.vogella.android.navigationwidgetattempt.driver getDriver() {
    return new com.vogella.android.navigationwidgetattempt.driver(pref.getString(com.vogella.android.navigationwidgetattempt.PrefManager.USER_FULLNAME, "No data"), pref.getString(com.vogella.android.navigationwidgetattempt.PrefManager.USER_EMAIL, "No data"), pref.getString(com.vogella.android.navigationwidgetattempt.PrefManager.USER_GENDER, "No data"), pref.getString(com.vogella.android.navigationwidgetattempt.PrefManager.USER_PHONE, "No data"), pref.getString(com.vogella.android.navigationwidgetattempt.PrefManager.USER_PASSWORD, "No data"));
}