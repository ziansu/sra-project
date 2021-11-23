private static boolean isAttachInvocationId(com.alibaba.dubbo.common.URL url, com.alibaba.dubbo.rpc.Invocation invocation) {
    java.lang.String value = url.getMethodParameter(invocation.getMethodName(), Constants.AUTO_ATTACH_INVOCATIONID_KEY);
    if (value == null) {
        return com.alibaba.dubbo.rpc.support.RpcUtils.isAsync(url, invocation);
    }else
        if (java.lang.Boolean.TRUE.toString().equalsIgnoreCase(value)) {
            return true;
        }else {
            return false;
        }
    
}