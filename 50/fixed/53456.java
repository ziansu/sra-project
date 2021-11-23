public void clean() {
    clients.remove(id);
    while (true) {
        org.nutz.plugins.ngrok.server.NgrokServer.NgrokServerClient.ProxySocket proxySocket = idleProxys.poll();
        if (proxySocket != null)
            org.nutz.lang.Streams.safeClose(proxySocket.socket);
        else
            break;
        
    } 
}