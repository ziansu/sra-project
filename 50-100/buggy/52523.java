public void addAllResults(java.util.ArrayList<com.quinny898.library.persistentsearch.SearchResult> results) {
    this.resultList.clear();
    for (int i = 0; i < (java.lang.Math.min(results.size(), getSearchResultLimit())); i++) {
        resultList.addAll(results);
    }
    mAdapter.notifyDataSetChanged();
}