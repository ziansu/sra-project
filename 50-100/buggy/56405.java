protected java.lang.String columnNames(java.lang.String... names) {
    java.util.ArrayList<java.lang.String> realNames = new java.util.ArrayList<>(names.length);
    for (int i = 0; i < (names.length); i++) {
        realNames.add(quote(names[i]));
    }
    return org.eclipse.jgit.util.StringUtils.join(realNames, ",");
}