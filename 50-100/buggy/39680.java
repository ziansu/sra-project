public static boolean isAsync(com.alibaba.dubbo.common.URL url, com.alibaba.dubbo.rpc.Invocation inv) {
    boolean isAsync;
    if (java.lang.Boolean.TRUE.toString().equals(inv.getAttachment(Constants.ASYNC_KEY))) {
        isAsync = true;
    }else {
        isAsync = url.getMethodParameter(com.alibaba.dubbo.rpc.support.RpcUtils.getMethodName(inv), Constants.ASYNC_KEY, false);
    }
    return isAsync;
}