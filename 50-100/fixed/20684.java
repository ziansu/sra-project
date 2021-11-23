public void error(int errno, java.lang.String msg) {
    org.mycat.netty.mysql.MySQLHandshakeHandler.logger.info(("error mesg : " + msg));
    transport.out.clear();
    org.mycat.netty.mysql.ERR err = new org.mycat.netty.mysql.ERR();
    err.errorCode = errno;
    err.errorMessage = msg;
    transport.out.writeBytes(err.toPacket());
}