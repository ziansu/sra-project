public void abandonColony() {
    colony = null;
    ((dhbw.karlsruhe.it.solar.core.stages.GameStartStage) (getStage())).refreshSelection(this);
    SolarEngine.MESSAGE_DISPATCHER.dispatchMessage(this, SolarMessageType.ACTOR_REMOVED, this);
}