private static org.bukkit.entity.Entity getBukkitEntity(java.lang.Object o) {
    java.lang.reflect.Method getBukkitEntity = makeMethod(o.getClass(), "getBukkitEntity");
    return callMethod(getBukkitEntity, o);
}