private java.lang.String[] getLeafNames(pal.treesearch.UnrootedMLSearcher.UNode base) {
    java.util.ArrayList al = new java.util.ArrayList();
    base.getLeafNames(al, this);
    java.lang.String[] result = new java.lang.String[al.size()];
    al.toArray(result);
    return result;
}