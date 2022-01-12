@java.lang.Override
public void onResponse(retrofit2.Call<com.softdesign.devintensive.data.network.res.UserModelRes> call, retrofit2.Response<com.softdesign.devintensive.data.network.res.UserModelRes> response) {
    if ((response.code()) == 200) {
        hideProgress();
        loginSuccess(response.body());
        mDataManager.getPreferencesManager().saveUserLogin(login);
    }else
        if ((response.code()) == 404) {
            hideProgress();
            showSnackbar(getString(R.string.auth_invalid_credentials));
        }else {
            hideProgress();
            showSnackbar(getString(R.string.msg_smth_went_wrong));
        }
    
}