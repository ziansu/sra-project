private android.util.SparseArray<AndroidAuxilary.Emoji> initializeEmojisMap() {
    android.util.SparseArray<AndroidAuxilary.Emoji> map = new android.util.SparseArray();
    int[] unicodes = getResources().getIntArray(R.array.emojis_unicode);
    for (int i = 0; i < (unicodes.length); i++) {
        map.put((i + 1), new AndroidAuxilary.Emoji((i + 1), new java.lang.String(java.lang.Character.toChars(unicodes[i]))));
    }
    return map;
}