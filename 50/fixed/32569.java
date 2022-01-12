@java.lang.Override
protected java.lang.Boolean doInBackground(com.lucien.hkmdemo.model.AccountModel... params) {
    return com.lucien.hkmdemo.api.ApiHelper.loginAccount(api, params[0]);
}