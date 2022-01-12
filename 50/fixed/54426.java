@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.util.Log.i(com.binkery.module.citypicker.CitySearchActivity.TAG, ("onQueryTextSubmit query = " + query));
    showSearchTip(query);
    return true;
}