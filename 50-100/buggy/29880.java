@java.lang.Override
protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray a, int index) {
    final java.lang.CharSequence[] defaultValues = a.getTextArray(index);
    final int valueCount = defaultValues.length;
    final java.util.Set<java.lang.String> result = new java.util.HashSet<java.lang.String>();
    for (int i = 0; i < valueCount; i++) {
        result.add(defaultValues[i].toString());
    }
    return result;
}