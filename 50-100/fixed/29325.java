public void build() throws java.lang.Exception {
    com.google.common.base.Preconditions.checkState((!(serviceLoader.isShutdown())), ("The server has" + " been started already!"));
    executeServiceLoad();
    com.asteria.network.ServerHandler.start(serverPort);
    serviceLoader.shutdown();
    if (!(serviceLoader.awaitTermination(15, java.util.concurrent.TimeUnit.MINUTES))) {
        throw new java.lang.IllegalStateException(("The background service load took" + " too long!"));
    }
    sequencer.scheduleAtFixedRate(new com.asteria.game.GameService(), 0, 600, java.util.concurrent.TimeUnit.MILLISECONDS);
}