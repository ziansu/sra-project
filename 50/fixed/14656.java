public void destroy() {
    bulletSystem.removeTickListener(physicsTickListener);
    tickLogicManager.destroy();
    preTickLogicManager.destroy();
    tickLogicManager = null;
    preTickLogicManager = null;
}