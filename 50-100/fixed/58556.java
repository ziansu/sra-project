private java.lang.String[] toStringArray(java.util.ArrayList<java.lang.String> list) {
    java.lang.String[] permz = new java.lang.String[list.size()];
    for (int i = 0; i < (permz.length); i++) {
        permz[i] = list.get(i);
    }
    return permz;
}