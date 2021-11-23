public static com.xuen.lettuceredis.SingleServerClientBuilder createSingle(java.lang.String host, int prot) {
    com.google.common.base.Preconditions.checkArgument((!(io.netty.util.internal.StringUtil.isNullOrEmpty(host))), "host is null");
    com.google.common.base.Preconditions.checkArgument((!((prot < 0) || (prot > 65535))), "The port number is not legitimate");
    return new com.xuen.lettuceredis.SingleServerClientBuilder(host, prot);
}