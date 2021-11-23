public static void d(java.lang.String tag, java.lang.String msg) {
    if ((monakhv.samlib.log.Log.logger) == null) {
        return ;
    }
    monakhv.samlib.log.Log.logger.debug(tag, msg);
}