public static java.util.HashMap<java.lang.String, searchEngine.PostingInfo> getMetaData(java.util.ArrayList<java.lang.String> queries) {
    java.util.HashMap<java.lang.String, searchEngine.PostingInfo> metadata = new java.util.HashMap<>();
    for (java.lang.String s : queries) {
        java.util.HashMap<java.lang.String, searchEngine.PostingInfo> tmp = searchEngine.Searcher.deserializeSingleEntry(s);
        metadata.put(s, tmp.get(s));
    }
    return metadata;
}