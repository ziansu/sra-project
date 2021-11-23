public void disconnect(sx.blah.discord.api.internal.DiscordDisconnectedEvent.Reason reason) {
    if (isConnected.get()) {
        client.dispatcher.dispatch(new sx.blah.discord.api.internal.DiscordDisconnectedEvent(reason));
        isConnected.set(false);
        executorService.shutdownNow();
        session.close();
        client.ws = null;
        java.lang.Thread.currentThread().interrupt();
    }
}