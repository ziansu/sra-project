protected void searchNext() {
    currentSearchIndex = java.lang.Math.min(((searchResults.size()) - 1), ((currentSearchIndex) + 1));
    refreshSearch();
}