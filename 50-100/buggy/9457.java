@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);
    java.util.TimerTask timerTask = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            finish();
            startActivity(new android.content.Intent(edu.orangecoastcollege.cs273.kfrederick5tmorrissey1ischenck.occstudentsuccesscenter.SplashActivity.this, edu.orangecoastcollege.cs273.kfrederick5tmorrissey1ischenck.occstudentsuccesscenter.MainActivity.class));
        }
    };
    java.util.Timer timer = new java.util.Timer();
    timer.schedule(timerTask, 1000);
    deleteDatabase(DBHelper.DATABASE_NAME);
    db = new edu.orangecoastcollege.cs273.kfrederick5tmorrissey1ischenck.occstudentsuccesscenter.DBHelper(this);
    populateDatabase();
}