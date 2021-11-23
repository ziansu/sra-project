void setExcludeTableName(java.lang.String excludeTableName) {
    this.excludeTableName = excludeTableName;
    this.tableAccessReaderBuilder = this.tableAccessReaderBuilder.excludeTableName(excludeTableName);
}