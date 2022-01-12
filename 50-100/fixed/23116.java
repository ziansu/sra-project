@java.lang.Override
public void execute() {
    new control.SetupPlayersAction(gc).execute();
    java.lang.System.out.println(gc.getPlayers());
    do {
        for (model.Player player : gc.getPlayers()) {
            gc.setActivePlayer(player);
            new control.PlayerTurnAction(gc).execute();
        }
    } while (true );
}