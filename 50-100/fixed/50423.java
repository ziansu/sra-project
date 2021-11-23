public void loadAdd(com.quinny898.library.persistentsearch.SearchBox search) {
    search.clearSearchable();
    java.util.ArrayList<java.lang.String> list = getListString("keys");
    list = new java.util.ArrayList<java.lang.String>(new java.util.HashSet<java.lang.String>(list));
    for (java.lang.String value : list) {
        search.addSearchable(new com.quinny898.library.persistentsearch.SearchResult(value, context.getResources().getDrawable(R.drawable.ic_history)));
    }
}