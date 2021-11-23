@java.lang.Override
public void execute() {
    new control.SetupPlayersAction(gc, true).execute();
    java.lang.System.out.println(gc.getPlayers());
    do {
        for (model.Player player : gc.getPlayers()) {
            if (!(player.isBankrupt())) {
                gc.setActivePlayer(player);
                new control.PlayerTurnAction(gc).execute();
            }
        }
    } while (gc.getGameOver() );
}