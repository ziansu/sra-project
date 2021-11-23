public static void verbose(java.lang.String tag, java.lang.String msg) {
    if ((cn.vbyte.p2p.LoggerCallback.logger) != null) {
        cn.vbyte.p2p.LoggerCallback.logger.v(tag, msg);
    }
}