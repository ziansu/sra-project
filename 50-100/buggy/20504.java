@java.lang.Override
public byte[] getBlbValue(java.lang.String key) {
    try {
        if ((com.raizlabs.android.dbflow.structure.container.JSONModel.getData()) != null) {
            java.lang.Object value = com.raizlabs.android.dbflow.structure.container.JSONModel.getData().get(key);
            if (value instanceof com.raizlabs.android.dbflow.data.Blob) {
                return ((com.raizlabs.android.dbflow.data.Blob) (value)).getBlob();
            }else {
                return ((byte[]) (value));
            }
        }
    } catch (org.json.JSONException e) {
        com.raizlabs.android.dbflow.config.FlowLog.logError(e);
        return null;
    }
}