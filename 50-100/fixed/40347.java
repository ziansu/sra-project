@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if (isAdded()) {
        if ((searchView) != null) {
            if (!(android.text.TextUtils.isEmpty(searchText))) {
                outState.putString("query", searchText);
            }
        }
    }
    super.onSaveInstanceState(outState);
}