@java.lang.Override
public void onNewApiaryFragmentInteraction() {
    android.util.Log.d(net.tscloud.hivenotes.MainActivity.TAG, "MainActivity.onNewApiaryFragmentInteraction called...");
    theApiaryList = getApiaryList();
    android.support.v4.app.Fragment fragment = net.tscloud.hivenotes.HomeFragment.newInstance(newProfile, getApiaryNameMap());
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.fragment_placeholder, fragment).addToBackStack("backstacktag2");
    ft.commit();
}