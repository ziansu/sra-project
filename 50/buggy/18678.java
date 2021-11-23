@java.lang.Override
public void startGame(com.example.ryanblaser.tickettoride.Server.Game game, int authenticationCode) {
    ServerProxy.SINGLETON.startGame(game, authenticationCode);
}