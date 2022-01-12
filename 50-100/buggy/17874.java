public static java.lang.String getHmac(java.lang.String[] args, java.lang.String key) {
    if ((args == null) || ((args.length) == 0)) {
        return null;
    }
    java.lang.StringBuffer str = new java.lang.StringBuffer();
    for (int i = 0; i < (args.length); i++) {
        str.append(args[i]);
    }
    return org.oxerr.chbtc.util.EncryDigestUtil.hmacSign(str.toString(), key);
}