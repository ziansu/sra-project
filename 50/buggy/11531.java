private void checkColumn(java.lang.String name) {
    com.google.common.base.Preconditions.checkArgument(schema.getFieldNames().contains(name), "Column %s does not exist", name);
}