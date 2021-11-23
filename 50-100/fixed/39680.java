public static boolean isAsync(com.alibaba.dubbo.common.URL url, com.alibaba.dubbo.rpc.Invocation inv) {
    return (java.lang.Boolean.TRUE.toString().equals(inv.getAttachment(Constants.ASYNC_KEY))) || (url.getMethodParameter(com.alibaba.dubbo.rpc.support.RpcUtils.getMethodName(inv), Constants.ASYNC_KEY, false));
}