public java.util.ArrayList getFirstRound() throws java.rmi.RemoteException {
    server.RainbowTables.firstRound();
    java.util.ArrayList<rainbowtables.Record> half = null;
    for (int i = 0; i < ((server.RainbowTables.size) / 2); i++) {
        half.add(server.RainbowTables.list.get(i));
    }
    return half;
}