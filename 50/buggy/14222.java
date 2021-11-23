@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String q) {
    sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.query = q;
    search();
    return true;
}