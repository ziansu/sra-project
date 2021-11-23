@java.lang.Override
public void onNavigationDrawerItemSelected(int position) {
    android.support.v4.app.Fragment fragment = null;
    switch (position) {
        case 0 :
            fragment = new com.rosh.pickup.TestFragment();
            break;
        case 1 :
            fragment = new com.rosh.pickup.SettingsFragment();
            break;
        case 2 :
            fragment = new com.rosh.pickup.TestFragment();
            break;
        default :
            break;
    }
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
}