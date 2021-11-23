@java.lang.Override
public com.elmakers.mine.bukkit.entity.EntityData damage(org.bukkit.entity.Entity entity) {
    com.elmakers.mine.bukkit.entity.EntityData data = modify(entity);
    if ((data != null) && (((undoEntityTypes) == null) || (!(undoEntityTypes.contains(entity.getType()))))) {
        data.setRespawn(true);
    }
    return data;
}