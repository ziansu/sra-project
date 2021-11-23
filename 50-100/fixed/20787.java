private static java.lang.String ConcatRow(java.lang.String[] row) {
    java.lang.String ret = "";
    boolean first = true;
    for (java.lang.String i : row) {
        ret = (!first) ? (ret + ',') + i : ret + i;
        first = false;
    }
    return ret;
}