public static gov.usgs.cida.config.DynamicReadOnlyProperties getInstance() {
    if (null == (gov.usgs.cida.auth.util.JNDISingleton.props)) {
        try {
            gov.usgs.cida.auth.util.JNDISingleton.props = new gov.usgs.cida.config.DynamicReadOnlyProperties().addJNDIContexts();
        } catch (javax.naming.NamingException e) {
            gov.usgs.cida.auth.util.JNDISingleton.LOG.warn("Error occured during initProps()", e);
        }
    }
    return gov.usgs.cida.auth.util.JNDISingleton.props;
}