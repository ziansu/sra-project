@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ph.edu.mobapde.meditake.meditake.util.ThemeUtil.onActivityCreateSetTheme(this);
    super.setActionBar(null);
    setContentView(R.layout.activity_welcome_screen);
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.content.Intent homeIntent = new android.content.Intent(ph.edu.mobapde.meditake.meditake.activity.WelcomeScreenActivity.this, ph.edu.mobapde.meditake.meditake.activity.ScheduleListActivity.class);
            startActivity(homeIntent);
            finish();
        }
    }, ph.edu.mobapde.meditake.meditake.activity.WelcomeScreenActivity.SPLASH_TIME_OUT);
}