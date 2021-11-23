@java.lang.Override
public void proceed(io.netty.channel.ChannelHandlerContext ctx, com.utc.api13.client.com.ComClientManager comClientManager) {
    if (answer) {
        comClientManager.getIClientDataToCom().initGame(this.ge);
    }else {
        comClientManager.getIClientDataToCom().notifyRejection(this.sender);
    }
}