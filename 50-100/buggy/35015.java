@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
    android.os.StrictMode.setThreadPolicy(policy);
    user = new example.com.videofly.User();
    makeMeRequest();
    fbFriendsRequest();
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}