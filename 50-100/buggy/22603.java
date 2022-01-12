public int[] exact(java.lang.String search, boolean caseSensitive) {
    java.util.List<java.lang.Integer> ids = null;
    if (caseSensitive) {
        search = search.toLowerCase();
        ids = containsCiRows.get(search);
    }else {
        ids = containsRows.get(search);
    }
    return ids != null ? ids.stream().mapToInt(( i) -> i).toArray() : new int[0];
}