public java.lang.String get(java.lang.String key) throws java.io.IOException, java.lang.ClassNotFoundException {
    net.tomp2p.dht.FutureGet futureGet = peer.get(net.tomp2p.peers.Number160.createHash(key)).start();
    futureGet.awaitUninterruptibly();
    if (futureGet.isSuccess()) {
        return futureGet.data().object().toString();
    }
    return null;
}