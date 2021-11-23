private void clearEpollOut() {
    if (((flags) & (Native.EPOLLOUT)) != 0) {
        flags = ~(Native.EPOLLOUT);
        ((io.netty.channel.epoll.EpollEventLoop) (eventLoop())).modify(this);
    }
}