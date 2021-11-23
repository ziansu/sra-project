private void endOfTurn() {
    try {
        serverConn.gameMapEndOfTurn();
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
    }
}