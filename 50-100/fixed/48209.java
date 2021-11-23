public static int splice(int fd, long offIn, int fdOut, long offOut, long len) throws java.io.IOException {
    int res = io.netty.channel.epoll.Native.splice0(fd, offIn, fdOut, offOut, len);
    if (res >= 0) {
        return res;
    }
    return io.netty.channel.epoll.Native.ioResult("splice", res, io.netty.channel.epoll.Native.CONNECTION_RESET_EXCEPTION_SPLICE);
}