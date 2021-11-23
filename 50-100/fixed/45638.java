public void add(java.lang.String stringValue) {
    int valueId = lookupTable.get(stringValue);
    if (valueId < 0) {
        synchronized(lookupTable) {
            if (((id) == 0) && ((lookupTable.size()) != 0)) {
                id = lookupTable.size();
            }
            valueId = (id)++;
            lookupTable.put(valueId, stringValue);
        }
    }
    values.add(valueId);
}