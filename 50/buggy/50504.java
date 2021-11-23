@java.lang.Override
protected void doSetValue(java.lang.String s) {
    if (s == null) {
        s = "";
    }
    value = s;
    requestRepaint();
    textIsDirty = true;
}