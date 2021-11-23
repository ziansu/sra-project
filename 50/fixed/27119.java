public void abandonColony() {
    SolarEngine.MESSAGE_DISPATCHER.dispatchMessage(this, SolarMessageType.ACTOR_REMOVED, this);
    colony = null;
    ((dhbw.karlsruhe.it.solar.core.stages.GameStartStage) (getStage())).refreshSelection(this);
}