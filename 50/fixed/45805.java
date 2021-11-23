public java.util.List<java.lang.String> findWord(java.lang.String arg0) {
    java.util.List<java.lang.String> tmpList = new java.util.Vector<>();
    this.iterateTrie(root, arg0.toUpperCase(), tmpList);
    return tmpList;
}