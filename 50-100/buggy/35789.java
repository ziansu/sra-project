public void initialize(com.simsilica.es.EntityData entityData, com.jvpichowski.jme3.es.bullet.BulletSystem bulletSystem) {
    if (((preTickLogicManager) != null) || ((tickLogicManager) != null)) {
        throw new java.lang.IllegalStateException("initialize was already called");
    }
    this.bulletSystem = bulletSystem;
    preTickLogicManager = new com.jvpichowski.jme3.es.logic.SimpleLogicManager();
    tickLogicManager = new com.jvpichowski.jme3.es.logic.SimpleLogicManager();
    preTickLogicManager.initialize(entityData);
    tickLogicManager.initialize(entityData);
    bulletSystem.getPhysicsSpace().addTickListener(physicsTickListener);
}