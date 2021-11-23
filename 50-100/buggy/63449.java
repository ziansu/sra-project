public java.util.HashSet<java.lang.String> getSearchHistory() {
    java.util.HashSet<java.lang.String> set = new java.util.HashSet<>();
    for (java.lang.String s : mSearchHistory) {
        if ((s.length()) > 0)
            set.add(s);
        
    }
    return set;
}