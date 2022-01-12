protected java.lang.String columnNames(java.lang.String... names) {
    java.util.ArrayList<java.lang.String> realNames = new java.util.ArrayList<>(names.length);
    for (java.lang.String name : names) {
        realNames.add(quote(name));
    }
    return org.eclipse.jgit.util.StringUtils.join(realNames, ",");
}