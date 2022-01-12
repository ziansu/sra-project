@java.lang.Override
protected void doSetValue(java.lang.String s) {
    value = (s == null) ? "" : s;
    textIsDirty = true;
}