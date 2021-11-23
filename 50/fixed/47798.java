public static void error(java.lang.String tag, java.lang.String msg) {
    if ((cn.vbyte.p2p.LoggerCallback.logger) != null) {
        cn.vbyte.p2p.LoggerCallback.logger.e(tag, msg);
    }
}