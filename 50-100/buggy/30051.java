@java.lang.Override
public com.elmakers.mine.bukkit.entity.EntityData damage(org.bukkit.entity.Entity entity) {
    com.elmakers.mine.bukkit.entity.EntityData data = modify(entity);
    if (((undoEntityTypes) != null) && (undoEntityTypes.contains(entity.getType()))) {
        data.removed(entity);
        entity.remove();
    }
    if (data != null) {
        data.setRespawn(true);
    }
    return data;
}