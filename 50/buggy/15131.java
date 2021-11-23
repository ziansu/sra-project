public void newEpisode() {
    previousState = competition.richmario.experiment.StateManager.getInitialState();
    previousAction = 0;
    prevMarioPos = new float[]{ 32.0F , 32.0F };
    lastWorldReward = -1;
    this.reset();
}