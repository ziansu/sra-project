public boolean onQueryTextChange(java.lang.String newText) {
    if (android.text.TextUtils.isEmpty(newText)) {
        mListView.clearTextFilter();
    }else {
        mListView.setFilterText(newText.toString());
    }
    return true;
}