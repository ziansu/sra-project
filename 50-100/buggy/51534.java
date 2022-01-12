public void canStartGame(java.util.UUID idTable, fr.utc.lo23.server.data.UserLight host) {
    boolean canLaunch;
    fr.utc.lo23.server.data.Table curTable = this.getTableFromId(idTable);
    if (curTable.getCurrentGame().startGame()) {
        canLaunch = true;
        myManager.getInterfaceToCom().tableCreatorRequestToStartGameAccepted(idTable);
        askMoneyMax(idTable);
    }else {
        canLaunch = false;
        myManager.getInterfaceToCom().tableCreatorRequestToStartGameRejected(idTable);
    }
}