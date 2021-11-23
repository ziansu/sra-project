private static org.bukkit.entity.Entity getBukkitEntity(java.lang.Object o) {
    java.lang.reflect.Method getBukkitEntity = com.trc202.CombatTag.OfflinePlayerLoader.makeMethod(o.getClass(), "getBukkitEntity");
    return com.trc202.CombatTag.OfflinePlayerLoader.callMethod(getBukkitEntity, o);
}