public void onTimePassed(final org.andengine.engine.handler.timer.TimerHandler pTimerHandler) {
    mEngine.unregisterUpdateHandler(pTimerHandler);
    at.blackariesstudio.manager.ResourcesManager.getInstance().loadMenuTextures();
    setScene(menuScene);
}