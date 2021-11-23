@java.lang.Override
public <T> T removeProperty(java.lang.String key) {
    setCurrentGraphInThreadLocal();
    if ((rawElement) != null)
        return super.removeProperty(key);
    
    return null;
}