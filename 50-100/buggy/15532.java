void remove(java.net.Socket skt) {
    if (server.NetworkState.sConnectionMap.containsKey(skt))
        server.NetworkState.sConnectionMap.remove(skt);
    
    if (server.NetworkState.sAddressMap.containsKey(skt.getInetAddress()))
        server.NetworkState.sConnectionMap.remove(skt.getInetAddress());
    
    if (mListModel.contains(skt.getInetAddress().getHostAddress()))
        mListModel.removeElement(skt.getInetAddress().getHostAddress());
    
}