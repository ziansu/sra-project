@java.lang.Deprecated
protected void setReadPending(final boolean readPending) {
    if (isRegistered()) {
        io.netty.channel.EventLoop eventLoop = eventLoop();
        if (eventLoop.inEventLoop()) {
            setReadPending0(readPending);
        }else {
            eventLoop.execute(new io.netty.util.internal.OneTimeTask() {
                @java.lang.Override
                public void run() {
                    setReadPending0(readPending);
                }
            });
        }
    }else {
        this.readPending = readPending;
    }
}