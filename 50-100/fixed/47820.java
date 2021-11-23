public static java.lang.String genSig(java.util.Map<java.lang.String, java.lang.String> params) {
    params.put(SysConstants.DEV, SysConstants.DEV_TYPE);
    params.put(SysConstants.VER, SysConstants.VERSION);
    java.lang.String str = com.giot.memo.util.SignatureUtil.concatParams(params);
    str += SysConstants.SECRET_KEY;
    java.lang.String sig = com.giot.memo.util.MD5Util.compute(str);
    return sig;
}