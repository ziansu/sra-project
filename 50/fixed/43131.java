@java.lang.Override
public <T> T getProperty(final java.lang.String key) {
    setCurrentGraphInThreadLocal();
    if ((rawElement) == null)
        return null;
    
    return super.getProperty(key);
}