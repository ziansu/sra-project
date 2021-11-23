static void remove(java.net.InetAddress address, java.util.ArrayList<Server.ClientInfo> clientsList) {
    int i = 0;
    while (i < (clientsList.size())) {
        if (clientsList.get(i).address.equals(address))
            clientsList.remove(clientsList.get(i));
        else
            i++;
        
    } 
}