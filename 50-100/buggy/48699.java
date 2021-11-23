@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_control);
    firebaseDBService = new com.schedule.services.net.FirebaseDBService();
    noteDBService = new com.schedule.services.db.NoteDBService(this);
    if ((!(isOnline())) || (firebaseDBService.isAuthorized())) {
        startMainFragment();
    }else {
        startAuthorizationFragment();
    }
}