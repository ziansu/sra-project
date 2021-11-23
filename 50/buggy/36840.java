private static void ensurePreferencesEditor(android.content.Context context) {
    if ((ds.framework.v4.Settings.sPreferencesEditor) == null) {
        ds.framework.v4.Settings.sPreferencesEditor = ds.framework.v4.Settings.getPreferencesEditor(context);
    }
}