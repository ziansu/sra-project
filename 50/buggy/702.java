@java.lang.Override
public void onNotLoggedIn() {
    com.kfu.lantimat.kfustudent.utils.CheckAuth.isAuth = false;
    com.kfu.lantimat.kfustudent.SharedPreferenceHelper.setSharedPreferenceBoolean(com.kfu.lantimat.kfustudent.utils.CheckAuth.context, com.kfu.lantimat.kfustudent.LoginActivity.AUTH, false);
}