public void clientQuit(long ID) {
    mClients.remove(ID);
    broadcast(new qstp.Message("MESSAGE", (-1), 0, (("Client ID: " + ID) + " - connection terminated!")));
}