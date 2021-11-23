private void receiveAuthorize(io.netty.channel.ChannelHandlerContext ctx, java.lang.String s) {
    WrapperString ws = new WrapperString(s);
    int id = Base64Codec.DecodeFromString(ws);
    java.lang.System.out.println(Main.I);
    Main.I.receiveAuthorize(ctx, id);
}