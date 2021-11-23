@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putInt(idv.seventhmoon.hkinfomap.MapsActivity.STATE_SELECTED_NAVIGATION_ITEM, getSupportActionBar().getSelectedNavigationIndex());
}