public final void clearEvent() {
    delayInputTasks.dispose();
    cDelayInputTimer.stop();
    Gdx.app.getPreferences("TIMER").clear();
    Gdx.app.getPreferences("TIMER").flush();
    dispose();
}