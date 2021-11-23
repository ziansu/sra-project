@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    restService = new com.mercury.gabadam.quickreports.RestService();
    setContentView(R.layout.activity_home);
    engineerName = ((android.widget.TextView) (findViewById(R.id.engineerName)));
    session = new com.mercury.gabadam.quickreports.UserSessionManager(getApplicationContext());
    if (session.checkLogin()) {
        finish();
    }
    refreshScreen();
}