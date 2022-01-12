public void setWebsocketChannel(org.jboss.netty.channel.Channel websocketChannel) {
    this.websocketChannel = websocketChannel;
    websocketChannel.setAttachment(this);
    socketChannel.setAttachment(this);
}