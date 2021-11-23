@java.lang.Override
public void onTokenRefresh() {
    super.onTokenRefresh();
    java.lang.String refreshedToken = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    storeRegIdInPref(refreshedToken);
}