public synchronized void sendGameUpdate(entities.Game newGame) {
    template.convertAndSend(rest.controllers.GameController.TOPIC_URI, newGame);
}