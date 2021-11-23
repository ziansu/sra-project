public int getMappedColumn(int renderIdx) {
    if (((columnMapping) == null) || (renderIdx == (-1))) {
        return renderIdx;
    }else {
        final java.lang.Integer result = columnMapping.get(renderIdx);
        if (result == null) {
            throw new java.lang.IllegalArgumentException(("Invalid index " + renderIdx));
        }
        return result;
    }
}