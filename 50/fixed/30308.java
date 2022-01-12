public static void log(final java.lang.String message) {
    final org.eclipse.e4.core.services.log.Logger logger = org.bonitasoft.studio.common.log.BonitaStudioLog.getLogger(Activator.PLUGIN_ID);
    if (logger != null) {
        logger.info(message);
    }else {
        java.lang.System.out.println(message);
    }
}