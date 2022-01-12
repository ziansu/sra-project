private java.util.List<java.lang.String> pruneDictByLength(int wordLength) {
    java.util.List<java.lang.String> prunedDict = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String s : this.dictionary) {
        if ((s.length()) == wordLength) {
            prunedDict.add(s);
        }
    }
    return prunedDict;
}