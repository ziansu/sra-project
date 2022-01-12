@java.lang.Override
public void channelRead0(com.lmx.xcall.client.ChannelHandlerContext ctx, com.lmx.xcall.client.RpcResponse response) throws java.lang.Exception {
    if (response.getRequestId().equals("pong"))
        return ;
    
    java.lang.String seqNo = response.getRequestId();
    try {
        com.lmx.xcall.client.SendFuture future = sendFutureMap.get(seqNo);
        if (future != null) {
            future.setResponse(response);
            future.isDone();
        }
    } finally {
        sendFutureMap.remove(seqNo);
    }
}