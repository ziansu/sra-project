private java.util.List<AndroidAuxilary.Emoji> initializeEmojisMap() {
    java.util.List<AndroidAuxilary.Emoji> map = new java.util.ArrayList<>();
    int[] unicodes = getResources().getIntArray(R.array.emojis_unicode);
    for (int i = 0; i < (unicodes.length); i++) {
        map.add(new AndroidAuxilary.Emoji((i + 1), new java.lang.String(java.lang.Character.toChars(unicodes[i]))));
    }
    return map;
}