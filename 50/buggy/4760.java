@java.lang.Override
public void onNavigationDrawerItemSelected(int position) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    fragmentManager.beginTransaction().replace(R.id.container, com.boolong.hangrywaits.Home.HomeFragment.newInstance((position + 1))).commit();
}