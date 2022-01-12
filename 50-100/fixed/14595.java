public static void i(java.lang.String tag, java.lang.Object obj) {
    if ((com.ssyijiu.library.MLog.MLev.lev) <= (com.ssyijiu.library.MLog.LogLev.I.lev)) {
        com.ssyijiu.library.MLog.tmpTAG = com.ssyijiu.library.MLog.TAG;
        com.ssyijiu.library.MLog.TAG = tag;
        com.ssyijiu.library.MLog.printLog(com.ssyijiu.library.MLog.LogLev.I, com.ssyijiu.library.MLog.getMsg(obj));
        com.ssyijiu.library.MLog.TAG = com.ssyijiu.library.MLog.tmpTAG;
    }
}