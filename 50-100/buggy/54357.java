private java.util.Set<java.lang.String> pruneDictByLength(int wordLength) {
    java.util.Set<java.lang.String> prunedDict = new java.util.HashSet<java.lang.String>();
    for (java.lang.String s : this.dictionary) {
        if ((s.length()) == wordLength) {
            prunedDict.add(s);
        }
    }
    return prunedDict;
}