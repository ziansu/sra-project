private void endOfTurn() {
    try {
        if ((currentPlayerID) == (myPlayerID)) {
            serverConn.gameMapEndOfTurn();
            java.lang.System.out.println("KONCZE TURE");
        }
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
    }
}