private void initServices() throws java.lang.Exception {
    createService(pl.edu.agh.game.player.action.services.EnemyPlayerAction.class);
    createService(pl.edu.agh.game.player.action.services.EnvironmentPlayerAction.class);
    createService(pl.edu.agh.game.player.action.services.FightPlayerAction.class);
}