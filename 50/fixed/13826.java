public static void log(int status, java.lang.String message, java.lang.Throwable throwable) {
    org.eclipse.thym.ui.HybridUI.logger.log(new org.eclipse.core.runtime.Status(status, org.eclipse.thym.ui.HybridUI.PLUGIN_ID, message, throwable));
}