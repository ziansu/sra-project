@java.lang.Override
public void displayMap() {
    if ((getSupportFragmentManager().findFragmentByTag(com.whiterabbit.pisabike.screens.main.MainActivity.MAP_TAG)) != null) {
        if ((getSupportFragmentManager().getBackStackEntryCount()) > 0) {
            getSupportFragmentManager().popBackStack();
        }
        return ;
    }
    com.whiterabbit.pisabike.screens.map.MapFragment fragment = com.whiterabbit.pisabike.screens.map.MapFragment.createInstance();
    getSupportFragmentManager().beginTransaction().add(R.id.main_activity_frame, fragment, com.whiterabbit.pisabike.screens.main.MainActivity.MAP_TAG).commit();
}