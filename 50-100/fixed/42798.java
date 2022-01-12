private void turnMessenger(java.lang.String nextPlayer, java.lang.String game) throws com.mashape.unirest.http.exceptions.UnirestException {
    java.lang.String uri = (Tools.YellowService.getServiceUrlForType(ServiceType.CLIENT)) + "/turn";
    Game.MessengerPayload loadDaShip = new Game.MessengerPayload(nextPlayer, game);
    com.mashape.unirest.http.Unirest.post(uri).header("Content-Type", "application/json").body(loadDaShip).asJson();
}