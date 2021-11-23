public static boolean isOneway(com.alibaba.dubbo.common.URL url, com.alibaba.dubbo.rpc.Invocation inv) {
    return (java.lang.Boolean.FALSE.toString().equals(inv.getAttachment(Constants.RETURN_KEY))) || (!(url.getMethodParameter(com.alibaba.dubbo.rpc.support.RpcUtils.getMethodName(inv), Constants.RETURN_KEY, true)));
}