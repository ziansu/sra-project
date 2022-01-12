public void savePref(java.lang.String key, boolean value) {
    me.wizos.loread.data.WithSet.editor.putBoolean(key, value);
    me.wizos.loread.data.WithSet.editor.apply();
}