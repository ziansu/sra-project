public void addToProfile(java.util.List<java.lang.String> allNgrams) {
    java.lang.String toAdd;
    int n;
    for (int i = 0; i < (allNgrams.size()); i++) {
        toAdd = allNgrams.get(i);
        if (ngrams.containsKey(toAdd)) {
            n = ngrams.get(toAdd);
            ngrams.put(toAdd, (n + 1));
        }else {
            ngrams.put(toAdd, 1);
        }
    }
}