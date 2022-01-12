@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if (isAdded()) {
        if ((searchView) != null) {
            java.lang.String searchText = searchView.getQuery().toString();
            if (!(android.text.TextUtils.isEmpty(searchText)))
                outState.putString("query", searchText);
            
        }
    }
    super.onSaveInstanceState(outState);
}