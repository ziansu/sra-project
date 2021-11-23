@java.lang.Override
public rx.Single<? extends okhttp3.ResponseBody> call(okhttp3.ResponseBody responseBody) {
    if (com.xabber.android.data.xaccount.XabberAccountManager.getInstance().deleteXMPPAccountsFromRealm())
        return rx.Single.just(responseBody);
    else
        return rx.Single.error(new java.lang.Throwable("Realm: xmpp accounts deletion error"));
    
}