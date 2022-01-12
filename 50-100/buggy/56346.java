@java.lang.Override
public void onDataLoaded(java.util.ArrayList<com.tk_squared.tuxedo3.tkkStation> stations) {
    tkkData = stations;
    android.app.FragmentManager fm = getFragmentManager();
    android.app.Fragment fragment = fm.findFragmentById(R.id.fragment_container);
    if (fragment == null) {
        fragment = new com.tk_squared.tuxedo3.TuxedoActivityFragment();
        fm.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
    }
}