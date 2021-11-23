public void printClientList() {
    java.util.ArrayList<java.lang.String> clientList = new java.util.ArrayList<>();
    for (tcpchatserver.server.ClientHandler c : server.getClientHandlers()) {
        if ((c.getClientName()) != null)
            clientList.add(c.getClientName());
        
    }
    server.sendMulticast(("CLIENTLIST:" + (java.lang.String.join(",", clientList))));
}