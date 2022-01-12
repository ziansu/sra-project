public void saveUserData(int id, java.lang.String email, java.lang.String name, java.lang.String gender, java.lang.String birthday) {
    castofo_nower.com.co.nower.support.SharedPreferencesManager.saveIntegerValue(SharedPreferencesManager.USER_ID, id);
    castofo_nower.com.co.nower.support.SharedPreferencesManager.saveStringValue(SharedPreferencesManager.USER_EMAIL, email);
    castofo_nower.com.co.nower.support.SharedPreferencesManager.saveStringValue(SharedPreferencesManager.USER_NAME, name);
    castofo_nower.com.co.nower.support.SharedPreferencesManager.saveStringValue(SharedPreferencesManager.USER_GENDER, gender);
    castofo_nower.com.co.nower.support.SharedPreferencesManager.saveStringValue(SharedPreferencesManager.USER_BIRTHDAY, birthday);
    castofo_nower.com.co.nower.models.User.setUserData(id, email, name, gender, birthday, null);
}