@java.lang.Override
public <T> T getAdapter(java.lang.Class<T> adapter) {
    if ((opiRuntimeDelegate) == null)
        return super.getAdapter(adapter);
    
    T obj = opiRuntimeDelegate.getAdapter(adapter);
    if (obj != null)
        return obj;
    else
        return super.getAdapter(adapter);
    
}