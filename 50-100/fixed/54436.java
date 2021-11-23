public static void main(java.lang.String[] args) {
    int port = 8766;
    if ((args.length) == 1) {
        port = java.lang.Integer.valueOf(args[0]);
    }
    java.util.List<com.wenweihu86.rpc.filter.Filter> filters = new java.util.ArrayList<>();
    com.wenweihu86.rpc.server.RPCServer rpcServer = new com.wenweihu86.rpc.server.RPCServer(port, filters);
    rpcServer.registerService(new com.wenweihu86.rpc.server.SampleServiceImpl());
    rpcServer.start();
}