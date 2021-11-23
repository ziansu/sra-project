static java.lang.String[] buildKeySelectionArgs(com.facebook.react.bridge.ReadableArray keys, int start, int count) {
    java.lang.String[] selectionArgs = new java.lang.String[count];
    for (int keyIndex = 0; keyIndex < count; keyIndex++) {
        selectionArgs[keyIndex] = keys.getString((start + keyIndex));
    }
    return selectionArgs;
}