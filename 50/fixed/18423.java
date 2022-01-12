private void savePref(java.lang.String key, int value) {
    me.wizos.loread.data.WithSet.editor.putInt(key, value);
    me.wizos.loread.data.WithSet.editor.apply();
}