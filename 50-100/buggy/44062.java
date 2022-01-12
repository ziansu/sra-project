private void initProjectionMap() {
    java.util.Map<java.lang.String, java.lang.String> projectionMap = new java.util.HashMap<>();
    java.lang.String[] columns = tableConfig.columns;
    if (columns != null) {
        for (java.lang.String column : columns) {
            if (!(android.text.TextUtils.isEmpty(column))) {
                this.projectionMap.put(column, column);
            }
        }
    }
    this.projectionMap = projectionMap;
}