public boolean contains(org.mobicents.media.server.io.network.channel.PacketHandler handler) {
    synchronized(this.handlers) {
        return this.handlers.contains(handler);
    }
}