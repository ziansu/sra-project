@java.lang.Override
public void setContextMap(java.util.Map<java.lang.String, java.lang.String> contextMap) {
    if (contextMap != null) {
        java.util.Map<java.lang.String, java.lang.String> map = mdc.get();
        if (map != null)
            map.putAll(contextMap);
        
    }
}