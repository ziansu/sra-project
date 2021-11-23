@java.lang.Override
public <T> T getAdapter(java.lang.Class<T> adapter) {
    return org.eclipse.core.runtime.Platform.getAdapterManager().getAdapter(this, adapter);
}