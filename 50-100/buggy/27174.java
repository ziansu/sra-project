@java.lang.SuppressWarnings(value = "unchecked")
protected final java.util.Enumeration<java.lang.String> getParameterNames() {
    try {
        return req.getParameterNames();
    } catch (java.lang.Exception e) {
        if (org.giiwa.framework.web.Model.log.isErrorEnabled())
            org.giiwa.framework.web.Model.log.error(e.getMessage(), e);
        
        return null;
    }
}