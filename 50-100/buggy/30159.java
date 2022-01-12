public static void putLong(android.content.Context context, java.lang.String key, long value, boolean commit) {
    ds.framework.v4.Settings.ensurePreferencesEditor(context);
    ds.framework.v4.Settings.sPreferencesEditor.putLong(key, value);
    if (commit) {
        ds.framework.v4.Settings.sPreferencesEditor.commit();
        ds.framework.v4.Settings.sPreferencesEditor = null;
    }
    if ((ds.framework.v4.Settings.sInstance) != null) {
        ds.framework.v4.Settings.sInstance.mSettings.put(key, value);
    }
}