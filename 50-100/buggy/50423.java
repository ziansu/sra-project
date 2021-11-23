public void loadAdd(com.quinny898.library.persistentsearch.SearchBox search) {
    search.clearSearchable();
    java.util.ArrayList<java.lang.String> list = getListString("keys");
    for (java.lang.String value : list) {
        search.addSearchable(new com.quinny898.library.persistentsearch.SearchResult(value, context.getResources().getDrawable(R.drawable.ic_history)));
    }
}