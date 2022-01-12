@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String queryText) {
    org.wikipedia.page.PageTitle firstResult = null;
    if ((getActivePanel()) == (org.wikipedia.search.SearchFragment.PANEL_SEARCH_RESULTS)) {
        firstResult = searchResultsFragment.getFirstResult();
    }
    if (firstResult != null) {
        navigateToTitle(firstResult, false, 0);
    }
    return true;
}