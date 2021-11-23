@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getSupportActionBar().setTitle(getResources().getString(R.string.title_quiz));
    com.pvanshah.sjsuquizapplication.student.network.NetworkStateListener.registerNetworkState(this);
    com.pvanshah.sjsuquizapplication.firebaseutils.FirebaseConfiguration firebaseConfiguration = new com.pvanshah.sjsuquizapplication.firebaseutils.FirebaseConfiguration();
    firebaseConfiguration.configureFirebase();
    callQuizzesService();
}