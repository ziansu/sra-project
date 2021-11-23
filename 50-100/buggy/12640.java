public org.avuna.httpd.util.unixsocket.UnixSocket accept() throws java.io.IOException {
    if (!(bound))
        bind();
    
    org.avuna.httpd.util.Logger.log("accepting");
    java.lang.String nsfd = org.avuna.httpd.util.CLib.accept(sockfd);
    org.avuna.httpd.util.Logger.log(nsfd);
    int i = java.lang.Integer.parseInt(nsfd.substring(0, nsfd.indexOf("/")));
    nsfd = nsfd.substring(((nsfd.indexOf("/")) + 1));
    org.avuna.httpd.util.unixsocket.UnixSocket us = new org.avuna.httpd.util.unixsocket.UnixSocket(file, i);
    return us;
}