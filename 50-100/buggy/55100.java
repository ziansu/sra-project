static void remove(java.net.InetAddress address, java.util.ArrayList<Server.ClientInfo> clientsList) {
    for (int i = 0; i < (clientsList.size()); i++) {
        if (clientsList.get(i).address.equals(address))
            clientsList.remove(clientsList.get(i));
        
    }
}