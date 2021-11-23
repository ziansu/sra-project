@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    ((com.project.locateme.mainViews.homeFragment.HomeFragment) (mainViewsAdapter.getFragment(0))).updateMarkers();
    ((com.project.locateme.mainViews.PlaceFragment) (mainViewsAdapter.getFragment(1))).updateEventListViewItems();
    ((com.project.locateme.mainViews.PlaceFragment) (mainViewsAdapter.getItem(1))).updatePlaceListViewItems();
    android.util.Log.e(this.getLocalClassName(), "update initiated");
}