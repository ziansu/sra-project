@java.lang.Override
public void startFight(com.playposse.heavybagzombie.service.fight.v2.FightSimulationV2 fightSimulation, boolean force) {
    if (((fightSimulator) != null) && (!force)) {
        return ;
    }
    stopFight();
    this.fightSimulation = fightSimulation;
    fightSimulator = new com.playposse.heavybagzombie.service.fight.v2.FightSimulatorV2(this, fightSimulation, this);
    fightSimulator.start();
    startForeground();
    android.util.Log.i(com.playposse.heavybagzombie.service.FightEngineService.LOG_CAT, "Service has started fight.");
}