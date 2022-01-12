private java.util.List<java.lang.Character> getBasicAlphaBeit(java.lang.String[] words, int prefixSize) {
    java.util.List<java.lang.Character> ret = new java.util.ArrayList();
    if (words == null) {
        return ret;
    }
    for (java.lang.String w : words) {
        if (!(ret.contains(w.charAt(prefixSize)))) {
            ret.add(w.charAt(prefixSize));
        }
    }
    return ret;
}