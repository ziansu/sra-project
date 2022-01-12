@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    _bottomNavigation = ((android.support.design.widget.BottomNavigationView) (findViewById(R.id.bottom_navigation)));
    _fragmentManager = getSupportFragmentManager();
    _fragment = new de.dhbw.advisory.FitnessFragment();
    android.support.v4.app.FragmentTransaction transaction = _fragmentManager.beginTransaction();
    transaction.replace(R.id.main_container, _fragment).commit();
    _bottomNavigation.setOnNavigationItemSelectedListener(this);
}