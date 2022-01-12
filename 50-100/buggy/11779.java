public void connect(java.lang.String host) throws java.io.IOException, java.net.SocketTimeoutException, java.net.UnknownHostException {
    decc.Peer pair = new decc.Peer(this, host, this.port);
    pairs.put(pair.getHostName(), pair);
    if ((pairs.size()) == 1)
        pair.sendBrcast(ip);
    
}