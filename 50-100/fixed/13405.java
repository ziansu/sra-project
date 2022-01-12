public java.util.ArrayList<java.lang.String> getWords(java.util.ArrayList<java.lang.String> list) {
    java.util.ArrayList<java.lang.String> words = new java.util.ArrayList<java.lang.String>();
    for (int i = 0; i < (list.size()); i++) {
        words.add(solve(list.get(i)));
    }
    return words;
}