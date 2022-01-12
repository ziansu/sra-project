@java.lang.Override
public void damageEntity(int entityId, int damage) {
    org.inaetics.dronessimulator.gameengine.common.state.GameEntity e = this.m_stateManager.getById(entityId);
    if (e != null) {
        if (e instanceof org.inaetics.dronessimulator.gameengine.common.state.HealthGameEntity) {
            org.inaetics.dronessimulator.gameengine.common.state.HealthGameEntity healthGameEntity = ((org.inaetics.dronessimulator.gameengine.common.state.HealthGameEntity) (e));
            healthGameEntity.damage(damage);
        }else {
            org.apache.log4j.Logger.getLogger(org.inaetics.dronessimulator.gameengine.physicsenginedriver.PhysicsEngineDriver.class).error(((("Tried to damage an entity without hp! Got: " + entityId) + " ") + e));
        }
    }else {
    }
}