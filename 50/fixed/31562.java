private void receiveToBattle(io.netty.channel.ChannelHandlerContext ctx, java.lang.String s) {
    Player pl = Main.I.getPlayer(ctx);
    if (pl == null)
        ctx.close();
    else
        pl.receiveToBattle();
    
}