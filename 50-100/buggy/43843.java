private boolean containComplexArguments(com.alibaba.dubbo.rpc.RpcInvocation invocation) {
    for (int i = 0; i < (invocation.getParameterTypes().length); i++) {
        if ((invocation.getParameterTypes()[i]) != (invocation.getArguments()[i])) {
            return true;
        }
    }
    return false;
}