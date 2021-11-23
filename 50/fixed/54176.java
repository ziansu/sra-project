public java.util.List<java.lang.String> print() {
    java.util.List<java.lang.String> results = new java.util.ArrayList<java.lang.String>();
    printNodes(java.util.Collections.singletonList(mRoot), 1, height(mRoot), results);
    return results;
}