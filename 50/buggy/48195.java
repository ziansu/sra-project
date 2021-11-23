public void savePref(java.lang.String key, java.lang.String value) {
    me.wizos.loread.data.WithSet.editor.putString(key, value);
    me.wizos.loread.data.WithSet.editor.apply();
}