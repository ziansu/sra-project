public void initialiseXspContext(final java.lang.Boolean includeScopes) {
    if (!includeScopes) {
        setRequestScope(com.ibm.xsp.extlib.util.ExtLibUtil.getRequestScope());
        setViewScope(com.ibm.xsp.extlib.util.ExtLibUtil.getViewScope());
        setSessionScope(com.ibm.xsp.extlib.util.ExtLibUtil.getSessionScope());
        setApplicationScope(com.ibm.xsp.extlib.util.ExtLibUtil.getApplicationScope());
    }
    setFacesContext(javax.faces.context.FacesContext.getCurrentInstance());
    setXspContext(com.ibm.xsp.extlib.util.ExtLibUtil.getXspContext());
}