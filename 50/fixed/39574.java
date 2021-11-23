private TrivaGameClient.Message WaitForMessage() {
    TrivaGameClient.Message msg = null;
    while ((msg = service.getQueuedMessage()) == null);
    return msg;
}