public static java.lang.String getHmac(java.lang.String[] args, java.lang.String key) {
    if ((args == null) || ((args.length) == 0)) {
        return null;
    }
    java.lang.StringBuffer str = new java.lang.StringBuffer();
    for (java.lang.String arg : args) {
        str.append(arg);
    }
    return org.oxerr.chbtc.util.EncryDigestUtil.hmacSign(str.toString(), key);
}