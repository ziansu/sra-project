public static void getResults() throws java.lang.Exception {
    try {
        com.pasapalabra.game.service.ClientConnection.userScore = ServiceLocator.service.getResults(com.pasapalabra.game.service.ClientConnection.sessionAuth);
        if (com.pasapalabra.game.service.ClientConnection.player1) {
            com.pasapalabra.game.service.ClientConnection.playing = false;
            com.pasapalabra.game.service.ClientConnection.reachZ = false;
            com.pasapalabra.game.service.ClientConnection.turn = false;
        }else {
            com.pasapalabra.game.service.ClientConnection.turn = false;
            com.pasapalabra.game.service.ClientConnection.reachZ = false;
        }
    } catch (java.lang.Exception e) {
        throw e;
    }
}