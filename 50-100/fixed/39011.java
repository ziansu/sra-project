private static java.util.List<java.lang.String> lookup(org.apache.lucene.search.suggest.analyzing.AnalyzingInfixSuggester suggester, java.lang.String keyword) throws java.io.IOException {
    java.util.List<org.apache.lucene.search.suggest.Lookup.LookupResult> results = suggester.lookup(keyword, 20, true, true);
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    for (org.apache.lucene.search.suggest.Lookup.LookupResult result : results) {
        list.add(result.key.toString());
    }
    return list;
}