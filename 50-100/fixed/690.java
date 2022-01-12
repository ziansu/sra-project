@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.Intent intent = this.getIntent();
    android.os.Bundle bundle = intent.getExtras();
    if (bundle != null) {
        TheUser = ((app.p2.b226.aau.caffeinetrackerfinal.User) (bundle.getSerializable("Auser")));
    }
    android.support.design.widget.BottomNavigationView navigation = ((android.support.design.widget.BottomNavigationView) (findViewById(R.id.navigation)));
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    changingFragment(new app.p2.b226.aau.caffeinetrackerfinal.MainFragment(TheUser));
}