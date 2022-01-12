@java.lang.SuppressWarnings(value = "unchecked")
public static com.raizlabs.android.dbflow.structure.InstanceAdapter getInstanceAdapter(java.lang.Class<?> modelClass) {
    com.raizlabs.android.dbflow.structure.InstanceAdapter internalAdapter = com.raizlabs.android.dbflow.config.FlowManager.getModelAdapter(modelClass);
    if (internalAdapter == null) {
        if (com.raizlabs.android.dbflow.structure.BaseModelView.class.isAssignableFrom(modelClass)) {
            internalAdapter = com.raizlabs.android.dbflow.config.FlowManager.getModelViewAdapter(modelClass);
        }else
            if (com.raizlabs.android.dbflow.structure.BaseQueryModel.class.isAssignableFrom(modelClass)) {
                internalAdapter = com.raizlabs.android.dbflow.config.FlowManager.getQueryModelAdapter(modelClass);
            }
        
    }
    return internalAdapter;
}