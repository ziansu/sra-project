@java.lang.Override
protected void customizeBootstrap(final io.netty.bootstrap.ServerBootstrap b) {
    if (((this.keys) != null) && (!(this.keys.isEmpty()))) {
        if ((this.scf) == null) {
            throw new java.lang.UnsupportedOperationException("No key access instance available, cannot use key mapping");
        }
        b.channelFactory(this.scf);
        b.option(MD5ChannelOption.TCP_MD5SIG, this.keys);
        b.childOption(ChannelOption.MAX_MESSAGES_PER_READ, 1);
    }
}