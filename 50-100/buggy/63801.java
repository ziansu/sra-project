@java.lang.Override
public void fieldNames(java.lang.String[] names) {
    if ((names.length) == 0) {
        fieldLookup = java.util.Collections.EMPTY_MAP;
    }
    java.util.Map<java.lang.String, java.lang.Integer> fieldLookup = new java.util.HashMap<>();
    for (int i = 0; i < (names.length); i++) {
        fieldLookup.put(names[i], i);
    }
    this.fieldLookup = fieldLookup;
}