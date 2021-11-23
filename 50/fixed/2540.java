private void handleContact(com.emergentorganization.cellrpg.core.Entity entity, com.emergentorganization.cellrpg.components.Name name) {
    if (name.internalID.equals(EntityID.BULLET.toString())) {
        handleBulletContact(entity);
    }
}