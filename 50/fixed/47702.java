public static void logError(java.lang.String message, java.lang.Object... data) {
    chylex.hee.system.logging.Log.info(((chylex.hee.api.message.utils.MessageLogger.prefixError) + message), data);
}