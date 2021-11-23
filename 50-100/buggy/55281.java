public static void putSerializable(android.content.Context context, java.lang.String key, java.io.Serializable value, boolean commit) {
    ds.framework.v4.Settings.ensurePreferencesEditor(context);
    java.lang.String encodedValue = new java.lang.String(ds.framework.v4.common.Base64.encode(ds.framework.v4.common.Common.serializeObject(value), Base64.DEFAULT));
    ds.framework.v4.Settings.sPreferencesEditor.putString(key, encodedValue);
    if (commit) {
        ds.framework.v4.Settings.sPreferencesEditor.commit();
        ds.framework.v4.Settings.sPreferencesEditor = null;
    }
    if ((ds.framework.v4.Settings.sInstance) != null) {
        ds.framework.v4.Settings.sInstance.mSettings.put(key, value);
    }
}