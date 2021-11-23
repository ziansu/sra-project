@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.content_main);
    android.os.Bundle bundle = getIntent().getExtras();
    com.elmexicano.lsteamer.xlocation.LocationListFragment listFragment = new com.elmexicano.lsteamer.xlocation.LocationListFragment();
    listFragment.setArguments(bundle);
    android.app.FragmentManager fm = getFragmentManager();
    android.app.FragmentTransaction transaction = fm.beginTransaction();
    transaction.replace(R.id.fragmentFrame, listFragment);
    transaction.commit();
}