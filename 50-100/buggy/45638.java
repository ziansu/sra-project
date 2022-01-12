public void add(java.lang.String stringValue) {
    int valueId = lookupTable.get(stringValue);
    if (valueId < 0) {
        valueId = (id)++;
        lookupTable.put(valueId, stringValue);
    }
    values.add(valueId);
}