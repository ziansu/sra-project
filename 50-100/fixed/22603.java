public int[] exact(java.lang.String search, boolean caseSensitive) {
    java.util.List<java.lang.Integer> ids = null;
    if (caseSensitive) {
        ids = containsRows.get(search);
    }else {
        search = search.toLowerCase();
        ids = containsCiRows.get(search);
    }
    return ids != null ? ids.stream().mapToInt(( i) -> i).toArray() : new int[0];
}