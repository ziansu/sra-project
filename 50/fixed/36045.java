public void write(java.lang.Object pkg) {
    net.datafans.netty.common.session.Session session = getSession();
    if (session == null) {
        return ;
    }
    session.write(pkg);
}