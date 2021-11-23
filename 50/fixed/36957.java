public boolean isLogin(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String token = sharedPreferences.getString(com.example.gssflyaway.mobilecourse.model.UserModel.TOKEN, "");
    if (token.equals(""))
        return true;
    else
        return true;
    
}