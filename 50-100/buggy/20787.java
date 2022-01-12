private static java.lang.String ConcatRow(java.lang.String[] row) {
    java.lang.String ret = "";
    boolean first = true;
    for (java.lang.String i : row) {
        if (i.contains(java.lang.Character.toString('"'))) {
            i = ('"' + i) + '"';
        }
        ret = (!first) ? (ret + ',') + i : ret + i;
        first = false;
    }
    return ret;
}