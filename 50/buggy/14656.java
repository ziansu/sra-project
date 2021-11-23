public void destroy() {
    bulletSystem.getPhysicsSpace().removeTickListener(physicsTickListener);
    tickLogicManager.destroy();
    preTickLogicManager.destroy();
    tickLogicManager = null;
    preTickLogicManager = null;
}