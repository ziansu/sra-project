private synchronized void BombThrown() {
    java.lang.System.out.println(match.Area(match.getFifoBombList().getFirst()));
    Client.Message message = new Client.Message(MessageIDs.THROWN_BOMB, json.toJson(match.getFifoBombList().getFirst()));
    communication.MessageGate(message);
    Client.Bomb bombThread = new Client.Bomb(match.getFifoBombList().getFirst());
    bombThread.start();
}