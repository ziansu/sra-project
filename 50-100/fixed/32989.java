public void updateClientList() {
    java.lang.String clients = "";
    for (ClientHandler ch : clientList) {
        if (ch.isReady) {
            clients = ((clients + (ch.clientName)) + " - ") + (ch.clientScore);
            clients = clients + "-new-";
        }
    }
    java.lang.String updatedClientList = "<clients> " + clients;
    announce(updatedClientList);
}