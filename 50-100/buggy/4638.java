private static void sendHttpRedirect(co.paralleluniverse.comsat.webactors.netty.ChannelHandlerContext ctx, co.paralleluniverse.comsat.webactors.netty.FullHttpRequest req, java.lang.String newUri) {
    final co.paralleluniverse.comsat.webactors.netty.FullHttpResponse res = new co.paralleluniverse.comsat.webactors.netty.DefaultFullHttpResponse(req.getProtocolVersion(), FOUND);
    co.paralleluniverse.comsat.webactors.netty.HttpHeaders.setHeader(res, co.paralleluniverse.comsat.webactors.netty.LOCATION, newUri);
    co.paralleluniverse.comsat.webactors.netty.WebActorHandler.writeHttpResponse(ctx, req, res, true);
}