public static synchronized void putInt(android.content.Context context, java.lang.String key, int value, boolean commit) {
    ds.framework.v4.Settings.ensurePreferencesEditor(context);
    ds.framework.v4.Settings.sPreferencesEditor.putInt(key, value);
    if (commit) {
        ds.framework.v4.Settings.sPreferencesEditor.commit();
    }
    if ((ds.framework.v4.Settings.sInstance) != null) {
        ds.framework.v4.Settings.sInstance.mSettings.put(key, value);
    }
}