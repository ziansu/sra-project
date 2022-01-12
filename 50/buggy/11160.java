@java.lang.Override
protected void execInitField() {
    setValue(getTableField().getTable().isMultiSelect());
    setValue(getTableField().getTable().isHeaderVisible());
}