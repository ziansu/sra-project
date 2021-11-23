@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    timber.log.Timber.plant(new timber.log.Timber.DebugTree());
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().addToBackStack(this.toString()).replace(R.id.activity_main, new com.morihacky.android.rxjava.MainFragment(), this.toString()).commit();
    }
}