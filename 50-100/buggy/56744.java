@java.lang.SuppressWarnings(value = "ConstantConditions")
@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    try {
        inflater.inflate(R.menu.main_menu, menu);
        android.view.MenuItem searchItem = menu.findItem(R.id.search);
        searchItem.setOnActionExpandListener(this);
        android.widget.SearchView searchView = ((android.widget.SearchView) (searchItem.getActionView()));
        searchView.setOnQueryTextListener(this);
        scanItem = menu.findItem(R.id.menu_scan);
        newItem = menu.findItem(R.id.menu_new);
    } catch (java.lang.Exception e) {
        fake.domain.adamlopresto.golite.Utils.error(getContext(), e);
    }
}