public void run() {
    try {
        sock = new java.net.Socket(server, port);
        outstream = sock.getOutputStream();
        instream = sock.getInputStream();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return ;
    }
    connected = true;
    sendMsg(null, "init", (("password=" + (password)) + ",compression=gzip"));
    socketReader.start();
    for (com.ubergeek42.weechat.weechatrelay.WRelayConnectionHandler wrch : connectionHandlers) {
        wrch.onConnect();
    }
}