static java.lang.String[] buildKeySelectionArgs(com.facebook.react.bridge.ReadableArray keys) {
    java.lang.String[] selectionArgs = new java.lang.String[keys.size()];
    for (int keyIndex = 0; keyIndex < (keys.size()); keyIndex++) {
        selectionArgs[keyIndex] = keys.getString(keyIndex);
    }
    return selectionArgs;
}