private void receiveRepeat(io.netty.channel.ChannelHandlerContext ctx, java.lang.String s) {
    Player pl = Main.I.getPlayer(ctx);
    if (pl == null)
        ctx.close();
    else
        pl.receiveRepeat(Base64Codec.DecodeFromString(new WrapperString(s)));
    
}