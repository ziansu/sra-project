@java.lang.SuppressWarnings(value = "unchecked")
protected java.util.Map<java.lang.String, java.lang.Object> parseObject(java.io.InputStream stream, java.lang.String charset) {
    java.lang.Object obj = parse(stream, charset, org.apache.chemistry.opencmis.client.bindings.spi.browser.AbstractBrowserBindingService.SIMPLE_CONTAINER_FACTORY);
    if (obj instanceof java.util.Map) {
        return ((java.util.Map<java.lang.String, java.lang.Object>) (obj));
    }else
        if (obj == null) {
            return null;
        }
    
    throw new org.apache.chemistry.opencmis.commons.exceptions.CmisConnectionException("Unexpected object!");
}