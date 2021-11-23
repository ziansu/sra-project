public java.lang.String[] getList(java.lang.String name, boolean removeWhitespace) {
    java.lang.String[] d = getString(name).split(", ");
    if (removeWhitespace) {
        for (int i = 0; i < (d.length); i++) {
            d[i] = d[i].replaceAll("\\s+", "");
        }
    }
    return d;
}