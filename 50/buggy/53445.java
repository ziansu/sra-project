@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.util.Log.v("SaleHistory", "onQueryTextSubmit called!");
    return onQueryTextChange(query);
}