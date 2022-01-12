@java.lang.Override
public rx.Single<? extends okhttp3.ResponseBody> call(okhttp3.ResponseBody responseBody) {
    com.xabber.android.data.xaccount.XabberAccountManager.getInstance().deleteXMPPAccountsFromRealm();
    return rx.Single.just(responseBody);
}