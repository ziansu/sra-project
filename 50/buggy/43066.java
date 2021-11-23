@java.lang.Override
public void onCreate() {
    super.onCreate();
    java.lang.String token = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    if (token != null) {
        com.five.shubhamagarwal.five.utils.Gen.saveFCMTokenToLocalStorage(token);
    }
    com.five.shubhamagarwal.five.MyApplication.instance = this;
}