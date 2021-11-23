public static void warning(final java.lang.String message, final java.lang.String bundleId) {
    final org.eclipse.e4.core.services.log.Logger logger = org.bonitasoft.studio.common.log.BonitaStudioLog.getLogger(bundleId);
    if (logger != null) {
        logger.warn(message);
    }else {
        java.lang.System.out.println(message);
    }
}