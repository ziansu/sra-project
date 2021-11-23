public boolean updateCollisionProperties(java.lang.String mobType, com.bergerkiller.bukkit.tc.CollisionMode mode) {
    if (mode == null) {
        return false;
    }
    for (com.bergerkiller.bukkit.tc.properties.CollisionConfig collisionConfigObject : com.bergerkiller.bukkit.tc.properties.CollisionConfig.values()) {
        if ((mobType.equals(collisionConfigObject.getMobType())) || (mobType.equals(collisionConfigObject.getPluralMobType()))) {
            collisionModes.put(collisionConfigObject, mode);
            return true;
        }
    }
    return false;
}