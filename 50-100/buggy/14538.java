public static com.gem.nhom1.feedbackemail.network.dto.ResponseUserInfoDTO getUserInfo(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.share_preferences_file), Context.MODE_PRIVATE);
    java.lang.String userInfoString = sharedPreferences.getString(Constant.USER_INFO, "");
    if (userInfoString == "")
        return null;
    
    try {
        com.gem.nhom1.feedbackemail.network.dto.ResponseUserInfoDTO userInfoDTO = new com.google.gson.Gson().fromJson(userInfoString, com.gem.nhom1.feedbackemail.network.dto.ResponseUserInfoDTO.class);
        return userInfoDTO;
    } catch (java.lang.Exception e) {
        return null;
    }
}