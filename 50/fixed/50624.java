public static android.content.SharedPreferences.Editor getPreferencesEditor(android.content.Context context) {
    if ((ds.framework.v4.Settings.sPreferencesEditor) == null) {
        ds.framework.v4.Settings.sPreferencesEditor = ds.framework.v4.Settings.getPreferences(context).edit();
    }
    return ds.framework.v4.Settings.sPreferencesEditor;
}