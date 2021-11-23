protected final void clearEpollIn() {
    if (((flags) & (readFlag)) != 0) {
        flags &= ~(readFlag);
        ((io.netty.channel.epoll.EpollEventLoop) (eventLoop())).modify(this);
    }
}