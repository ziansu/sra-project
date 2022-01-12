@java.lang.Override
public void exitMatchMaking(com.pasapalabra.game.service.auth.Token session, java.lang.String type) throws java.rmi.RemoteException {
    if (com.pasapalabra.game.service.auth.SessionManager.isValidSession(session)) {
        if (com.pasapalabra.game.service.PasapalabraService.waitingClients.containsKey(session.getToken())) {
            com.pasapalabra.game.service.PasapalabraService.waitingClients.get(type).remove(session.getToken());
            com.pasapalabra.game.service.PasapalabraService.currentClients.remove(session.getToken());
            com.pasapalabra.game.service.PasapalabraService.currentResult.remove(session.getToken());
            com.pasapalabra.game.service.PasapalabraService.currentQuestions.remove(session.getToken());
        }
    }
}