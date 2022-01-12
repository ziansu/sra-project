protected void goToMain() {
    zj.remote.baselibrary.util.PreferenceUtils.putString(Config.KEY_USER, mLoginUserEdt.getText().toString(), this);
    zj.remote.baselibrary.util.PreferenceUtils.putBoolean(Config.KEY_ISLOGIN, true, this);
    zj.remote.baselibrary.util.PreferenceUtils.putString(Config.KEY_PASS, mLoginPassEdt.getText().toString(), this);
    com.kerchin.yellownote.data.bean.PrimaryData.getInstance(getHelper(), new com.kerchin.yellownote.data.bean.PrimaryData.DoAfterWithEx() {
        @java.lang.Override
        public void justNowWithEx(java.lang.Exception e) {
            dismissDialog();
        }
    });
    handler.post(runnableForData);
}