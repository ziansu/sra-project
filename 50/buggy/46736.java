public synchronized void sendGameUpdate(entities.Game newGame) {
    java.lang.System.out.println((("SACO TIPO MOV: " + (newGame.getTypeMovement())) + "\n"));
    template.convertAndSend(rest.controllers.GameController.TOPIC_URI, newGame);
}