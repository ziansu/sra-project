private java.util.List<com.kasirgalabs.etumulator.linker.Data> resolveData() {
    java.util.List<com.kasirgalabs.etumulator.linker.Data> resolvedData = new java.util.ArrayList<>();
    for (com.kasirgalabs.etumulator.linker.Data data : targetData) {
        if (definedData.contains(data)) {
            com.kasirgalabs.etumulator.linker.Data temp = definedData.get(definedData.indexOf(data));
            loadIntoMemory(temp);
            resolvedData.add(temp);
            continue;
        }
        return null;
    }
    return resolvedData;
}