@java.lang.Override
protected void customizeBootstrap(final io.netty.bootstrap.Bootstrap b) {
    if (((this.keys) != null) && (!(this.keys.isEmpty()))) {
        if ((this.cf) == null) {
            throw new java.lang.UnsupportedOperationException("No key access instance available, cannot use key mapping");
        }
        b.channelFactory(this.cf);
        b.option(MD5ChannelOption.TCP_MD5SIG, this.keys);
    }
    b.option(ChannelOption.MAX_MESSAGES_PER_READ, 1);
}