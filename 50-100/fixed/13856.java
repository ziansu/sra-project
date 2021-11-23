public java.util.ArrayList<rainbowtables.Record> getFirstRound() throws java.rmi.RemoteException {
    server.RainbowTables.firstRound();
    java.util.ArrayList<rainbowtables.Record> half = new java.util.ArrayList<rainbowtables.Record>();
    for (int i = 0; i < ((server.RainbowTables.size) / 2); i++) {
        half.add(server.RainbowTables.list.get(i));
    }
    return half;
}