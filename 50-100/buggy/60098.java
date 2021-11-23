public void injectKeywords(java.util.Collection<com.jbirdvegas.mgerrit.search.SearchKeyword> keywords) {
    if ((keywords == null) && ((mAdditionalKeywords) != null)) {
        mAdditionalKeywords.clear();
    }else {
        mAdditionalKeywords = new java.util.HashSet(keywords);
    }
    onQueryTextSubmit(getQuery().toString());
}