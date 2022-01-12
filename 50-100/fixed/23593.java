public java.lang.String getCommonExtension() {
    java.util.Map.Entry<java.lang.String, java.lang.Integer> largest = null;
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : extensionCount.entrySet()) {
        if ((largest == null) || ((largest.getValue()) < (entry.getValue()))) {
            largest = entry;
        }
    }
    if (largest == null) {
        return null;
    }
    return largest.getKey();
}