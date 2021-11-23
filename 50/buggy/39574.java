private TrivaGameClient.Message WaitForMessage() {
    TrivaGameClient.Message msg = null;
    while ((msg = service.getQueuedMessage()) == null);
    playerID = ((TrivaGameClient.UserInformationMessage) (msg)).getPlayerId();
    return msg;
}