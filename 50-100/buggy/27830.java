@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.search_result_settings)) {
        android.support.v4.app.Fragment fragment = new se.umu.cs.pvt151.search.SearchResultSettingsFragment();
        getActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).add(R.id.frame_container, fragment).commit();
        return true;
    }
    return super.onOptionsItemSelected(item);
}