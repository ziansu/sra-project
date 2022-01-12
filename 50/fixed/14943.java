@java.lang.Override
@java.lang.SuppressWarnings(value = "rawtypes")
public java.lang.Object getAdapter(java.lang.Class adapter) {
    return org.eclipse.core.runtime.Platform.getAdapterManager().getAdapter(this, adapter);
}