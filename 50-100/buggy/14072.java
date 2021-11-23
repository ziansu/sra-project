public int getMappedColumn(int renderIdx) {
    if ((columnMapping) == null) {
        return renderIdx;
    }else {
        java.lang.Integer result = columnMapping.get(renderIdx);
        if (result == null)
            throw new java.lang.IllegalArgumentException(("Invalid index " + renderIdx));
        
        return result;
    }
}