public int getRenderIndexFromRealIdx(int realIdx) {
    if (((columnMapping) == null) || (realIdx == (-1))) {
        return realIdx;
    }
    for (final java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : columnMapping.entrySet()) {
        if (entry.getValue().equals(realIdx)) {
            return entry.getKey();
        }
    }
    return realIdx;
}