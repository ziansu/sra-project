@java.lang.Override
public void onTokenRefresh() {
    java.lang.String refreshedToken = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    com.codepath.socialshopper.socialshopper.Listeners.MyFirebaseInstanceIDService.REGISTRATION_ID = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    android.util.Log.d(com.codepath.socialshopper.socialshopper.Listeners.MyFirebaseInstanceIDService.TAG, ("Token: " + refreshedToken));
}