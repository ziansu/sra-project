private static boolean isAttachInvocationId(com.alibaba.dubbo.common.URL url, com.alibaba.dubbo.rpc.Invocation invocation) {
    java.lang.String value = url.getMethodParameter(invocation.getMethodName(), Constants.AUTO_ATTACH_INVOCATIONID_KEY);
    return value == null ? com.alibaba.dubbo.rpc.support.RpcUtils.isAsync(url, invocation) : java.lang.Boolean.TRUE.toString().equalsIgnoreCase(value);
}