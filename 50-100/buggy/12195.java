public static java.util.Map<java.lang.String, java.lang.String> getInvertedModIdMap() {
    if ((com.compomics.denovogui.io.PepNovoModificationFile.modIdMap) == null) {
        com.compomics.denovogui.io.PepNovoModificationFile.fillModIdMap();
    }
    if ((com.compomics.denovogui.io.PepNovoModificationFile.invertedModIdMap) == null) {
        com.compomics.denovogui.io.PepNovoModificationFile.invertedModIdMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : com.compomics.denovogui.io.PepNovoModificationFile.modIdMap.entrySet()) {
            com.compomics.denovogui.io.PepNovoModificationFile.invertedModIdMap.put(entry.getValue(), entry.getKey());
        }
    }
    return com.compomics.denovogui.io.PepNovoModificationFile.invertedModIdMap;
}