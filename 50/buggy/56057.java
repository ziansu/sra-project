public java.util.Iterator<org.arabidopsis.ahocorasick.SearchResult<T>> search(byte[] bytes) {
    return new org.arabidopsis.ahocorasick.Searcher<T>(this, this.startSearch(bytes));
}