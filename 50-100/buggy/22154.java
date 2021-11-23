private void addToMap(java.lang.String secondaryName, java.lang.String primaryName) {
    java.util.HashSet<java.lang.String> strings = geneMaps.get(secondaryName);
    if (strings == null) {
        strings = new java.util.HashSet<java.lang.String>();
        geneMaps.put(secondaryName, strings);
        geneMapKeysSorted.add(secondaryName);
    }
    strings.add(primaryName);
}