@java.lang.Override
public void onDataParsed(com.farfromsober.ffs.model.User data) {
    if (data != null) {
        android.util.Log.i("ffs", data.toString());
        java.lang.String userJson = com.farfromsober.generalutils.SharedPreferencesGeneralManager.objectToJSONString(data);
        com.farfromsober.ffs.utils.SharedPreferencesManager.savePrefUserData(getApplicationContext(), userJson);
        com.farfromsober.ffs.utils.SharedPreferencesManager.savePrefLoginUser(getApplicationContext(), this.loginData);
        this.showMainActivity();
    }else {
        this.showErrorMessage();
    }
}