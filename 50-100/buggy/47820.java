public static java.lang.String genSig(java.util.Map<java.lang.String, java.lang.String> params) {
    params.put(SysConstants.DEV, SysConstants.DEV_TYPE);
    params.put(SysConstants.VER, SysConstants.VERSION);
    java.lang.String str = com.giot.memo.util.SignatureUtil.concatParams(params);
    str += SysConstants.SECRET_KEY;
    com.giot.memo.util.LogUtil.i(com.giot.memo.util.SignatureUtil.TAG, ("拼接字符串: " + str));
    java.lang.String sig = com.giot.memo.util.MD5Util.compute(str);
    com.giot.memo.util.LogUtil.i(com.giot.memo.util.SignatureUtil.TAG, ("签名结果: " + sig));
    return sig;
}