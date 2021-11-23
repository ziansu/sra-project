public static void endGame(com.core.domain.knockout.GameInstance gi) {
    com.core.manager.GameQueueManager.log.info("debug Game Done !!!");
    gi.setStateToDone();
    gi.markGameWinner();
    com.core.manager.GameQueueManager.finishedGames.put(gi.getId(), gi);
    com.core.manager.GameQueueManager.ongoingGames.remove(gi.getId());
}