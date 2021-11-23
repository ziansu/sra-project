@java.lang.Override
public void startEngine() {
    pl.engine.Utils.debug("========================================");
    pl.engine.Utils.debug("======= 	SHAKE GAME START !!! ========");
    pl.engine.Utils.debug("========================================");
    for (pl.engine.Team team : teams) {
        team.printPlayers();
    }
}