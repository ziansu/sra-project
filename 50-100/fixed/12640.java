public org.avuna.httpd.util.unixsocket.UnixSocket accept() throws java.io.IOException {
    if (!(bound))
        bind();
    
    java.lang.String nsfd = org.avuna.httpd.util.CLib.accept(sockfd);
    int i = java.lang.Integer.parseInt(nsfd.substring(0, nsfd.indexOf("/")));
    nsfd = nsfd.substring(((nsfd.indexOf("/")) + 1));
    org.avuna.httpd.util.unixsocket.UnixSocket us = new org.avuna.httpd.util.unixsocket.UnixSocket(file, i);
    return us;
}