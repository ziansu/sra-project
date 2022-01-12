private synchronized void getKeyword(java.lang.String s) {
    keyWordResult = null;
    java.lang.String tmp = null;
    java.lang.String[] a = s.split(" ");
    for (int i = 0; i < (a.length); i++) {
        if ((valSet.contains(a[i])) && ((keywordPreposition) < i)) {
            keyWordResult = a[i];
            keywordPreposition = i;
            update = true;
        }
    }
}