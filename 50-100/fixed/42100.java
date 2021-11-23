public final void register() {
    socketEventHandler.onRegistered();
    try {
        key = channel.register(eventloop.ensureSelector(), ops, this);
    } catch (final java.io.IOException e) {
        eventloop.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                closeChannel();
                socketEventHandler.onClosedWithError(e);
            }
        });
    }
    if (((this.ops) & (java.nio.channels.SelectionKey.OP_READ)) != 0) {
        onReadReady();
    }
}