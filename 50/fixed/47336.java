public void createNewRunningProtocol(java.lang.String userId, java.lang.String farmId, java.lang.String protocolId, java.util.ArrayList<com.vetoquinol.vetosynch.AnimalEntry> animals, java.util.Date dateToStart) {
    new com.vetoquinol.vetosynch.RunningProtocolModel.CreateRunningProtocolThread(userId, farmId, protocolId, animals, dateToStart).start();
}