private void receiveDisconnect(io.netty.channel.ChannelHandlerContext ctx) {
    java.lang.System.out.println("disconnect");
    Player pl = Main.I.getPlayer(ctx);
    if (pl == null)
        ctx.close();
    
    pl.receiveDisconnect();
}