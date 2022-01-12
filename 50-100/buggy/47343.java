private void writeResult(io.netty.channel.ChannelHandlerContext ctx, com.toby.aDNS.Record question, com.toby.aDNS.Message dnsResult, io.netty.channel.socket.DatagramPacket msg, boolean writeCache) {
    if (writeCache)
        com.toby.aDNS.DNSMessageCache.put(question.hashCode(), dnsResult);
    
    if (dnsResult != null)
        ctx.write(new io.netty.channel.socket.DatagramPacket(io.netty.buffer.Unpooled.copiedBuffer(dnsResult.toWire()), msg.sender()));
    
}