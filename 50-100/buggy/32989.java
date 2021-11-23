public void updateClientList() {
    java.lang.String clients = "";
    int counter = 1;
    for (ClientHandler ch : clientList) {
        if (ch.isReady) {
            clients = ((clients + (ch.clientName)) + " - ") + (ch.clientScore);
            if (counter < (clientList.size())) {
                clients = clients + "-new-";
            }
        }
        counter++;
    }
    java.lang.String updatedClientList = "<clients> " + clients;
    announce(updatedClientList);
}