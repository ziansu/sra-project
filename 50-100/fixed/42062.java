private static boolean versionEqOrGt(int major, int minor, int bugfix) {
    if ((io.netty.channel.epoll.EpollReuseAddrTest.MAJOR) > major) {
        return true;
    }
    if ((io.netty.channel.epoll.EpollReuseAddrTest.MAJOR) == major) {
        if ((io.netty.channel.epoll.EpollReuseAddrTest.MINOR) > minor) {
            return true;
        }else
            if ((io.netty.channel.epoll.EpollReuseAddrTest.MINOR) == minor) {
                if ((io.netty.channel.epoll.EpollReuseAddrTest.BUGFIX) >= bugfix) {
                    return true;
                }
            }
        
    }
    return false;
}