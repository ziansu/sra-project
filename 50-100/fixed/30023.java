@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_voyager_main);
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    co.sethspace.voyageralert.VoyagerMainActivityFragment voyagerMainActivityFragment = new co.sethspace.voyageralert.VoyagerMainActivityFragment();
    fragmentTransaction.add(R.id.voyager_main_activity, voyagerMainActivityFragment);
    fragmentTransaction.commit();
}