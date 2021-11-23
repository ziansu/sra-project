public ru.alepar.rpc.api.RpcClient build() {
    return new ru.alepar.rpc.client.NettyRpcClient(serverAddress, java.util.Collections.unmodifiableMap(implementations), listeners.toArray(new ru.alepar.rpc.api.ExceptionListener[listeners.size()]), new ru.alepar.rpc.common.PrimitiveTypesClassResolver(classResolver), keepAlive, bossExecutor, workerExecutor);
}