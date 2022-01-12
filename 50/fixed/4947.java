protected void addSpecialNames(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> nameMaps, java.lang.String namespaceURI, java.lang.String... names) {
    addSpecialNamesWithParent(nameMaps, namespaceURI, org.vast.swe.json.SWEJsonStreamWriter.NO_PARENT, names);
}