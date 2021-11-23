public void updateUserData() {
    int id = castofo_nower.com.co.nower.support.SharedPreferencesManager.getIntegerValue(SharedPreferencesManager.USER_ID);
    java.lang.String email = castofo_nower.com.co.nower.support.SharedPreferencesManager.getStringValue(SharedPreferencesManager.USER_EMAIL);
    java.lang.String name = castofo_nower.com.co.nower.support.SharedPreferencesManager.getStringValue(SharedPreferencesManager.USER_NAME);
    java.lang.String gender = castofo_nower.com.co.nower.support.SharedPreferencesManager.getStringValue(SharedPreferencesManager.USER_GENDER);
    java.lang.String birthday = castofo_nower.com.co.nower.support.SharedPreferencesManager.getStringValue(SharedPreferencesManager.USER_BIRTHDAY);
    castofo_nower.com.co.nower.models.User.setUserData(id, email, name, gender, birthday);
}