@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    settings = ((net.osmand.plus.OsmandApplication) (getApplication())).getSettings();
    net.osmand.plus.OsmandApplication app = ((net.osmand.plus.OsmandApplication) (getApplication()));
    favouritesAdapter = new net.osmand.plus.activities.FavouritesListFragment.FavouritesAdapter(activity, app.getFavorites().getFavouritePoints());
    setListAdapter(favouritesAdapter);
}