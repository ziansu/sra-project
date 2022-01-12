@java.lang.Override
protected java.lang.Integer toValue(java.lang.String str) {
    str = inputCleaner.cleanInt(str);
    return java.lang.Integer.parseInt(str);
}