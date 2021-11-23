@java.lang.Override
public void onNewProfileFragmentInteraction(net.tscloud.hivenotes.db.Profile profile) {
    android.util.Log.d(net.tscloud.hivenotes.MainActivity.TAG, "MainActivity.onNewProfileFragmentInteraction called...");
    newProfile = false;
    theProfile = profile;
    android.support.v4.app.Fragment fragment = net.tscloud.hivenotes.HomeFragment.newInstance(newProfile, getApiaryNameMap());
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.fragment_placeholder, fragment);
    ft.commit();
}