@java.lang.SuppressWarnings(value = "unchecked")
public static com.raizlabs.android.dbflow.structure.InstanceAdapter getInstanceAdapter(java.lang.Class<?> modelClass) {
    com.raizlabs.android.dbflow.structure.InstanceAdapter internalAdapter = com.raizlabs.android.dbflow.config.FlowManager.getModelAdapter(modelClass);
    if (internalAdapter == null) {
        internalAdapter = com.raizlabs.android.dbflow.config.FlowManager.getModelViewAdapter(modelClass);
        if (internalAdapter == null) {
            internalAdapter = com.raizlabs.android.dbflow.config.FlowManager.getQueryModelAdapter(modelClass);
        }
    }
    return internalAdapter;
}