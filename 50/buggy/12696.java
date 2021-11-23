public static org.apache.lucene.search.PrefixQuery createPrefixQuery(java.lang.String searchField, java.lang.String keyword) {
    return new org.apache.lucene.search.PrefixQuery(new org.apache.lucene.index.Term(searchField, (keyword + "*")));
}