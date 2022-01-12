@java.lang.Override
public void modifyFile(java.io.RandomAccessFile file, int flags, java.lang.Object data) {
    final io.bicycle.epoll.EventPolling.FileFDTuple tuple = tupleFor(file);
    final io.bicycle.epoll.NativePollEvent event = tuple.event;
    event.events = flags;
    tuple.data = data;
    event.write();
    if ((io.bicycle.epoll.EventPolling.epoll_ctl(epfd, io.bicycle.epoll.EventPolling.EPOLL_CTL_MOD, tuple.fd, event.getPointer())) == (-1)) {
        throw new java.lang.RuntimeException("Unable to add to epoll set");
    }
}