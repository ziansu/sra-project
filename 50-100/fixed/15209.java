@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_crime);
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
    if (fragment == null) {
        fragment = new com.lynnik.criminalintent.CrimeFragment();
        fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
    }
}