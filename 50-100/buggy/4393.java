@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ((newText.length()) > 1) {
        searchResults.setVisibility(view.VISIBLE);
        if ((actualNumWords) > (newText.length())) {
            actualNumWords = newText.length();
            searchadapter.emptyResults();
        }
        java.lang.String url = com.sociale_sports.Utils.UtilsHTTP.createUrl("11", newText);
        com.sociale_sports.Utils.UtilsHTTP.getRequest(getContext(), url, this);
    }else {
        searchResults.setVisibility(view.GONE);
    }
    return false;
}