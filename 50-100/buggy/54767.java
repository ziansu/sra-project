private java.lang.String listToString(java.util.List<java.lang.String> list) {
    java.lang.StringBuffer strBuf = new java.lang.StringBuffer();
    for (java.lang.String term : list) {
        strBuf.append(term);
        strBuf.append(' ');
    }
    return strBuf.toString();
}