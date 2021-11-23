public boolean includeSuperEntityColumns(java.lang.String fieldName) {
    if (null != (superEntityColumns)) {
        for (java.lang.String column : superEntityColumns) {
            if (column.equals(fieldName)) {
                return true;
            }
        }
    }
    return false;
}