public testmd.Permutation addParameter(java.lang.String key, java.lang.Object value, testmd.ValueFormat valueFormat) {
    if (key.endsWith("_asTable")) {
        key = key.substring(0, ((key.length()) - ("_asTable".length())));
        formattedAsTable(key);
    }
    parameters.put(key, new testmd.Value(value, valueFormat));
    return this;
}