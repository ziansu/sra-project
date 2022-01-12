public static java.lang.String getBundleProperty(final java.lang.String inKey) {
    if (org.hip.kernel.sys.VSys.cContextPath.isEmpty()) {
        try {
            final java.util.ResourceBundle lBundle = java.util.ResourceBundle.getBundle(org.hip.kernel.sys.VSys.cSysName);
            return lBundle == null ? null : ((java.lang.String) (lBundle.getObject(inKey)));
        } catch (final java.util.MissingResourceException exc) {
            return null;
        }
    }
    try {
        return org.hip.kernel.sys.VSys.getVSysProperties().getProperty(inKey);
    } catch (final java.io.IOException exc) {
    }
    return null;
}