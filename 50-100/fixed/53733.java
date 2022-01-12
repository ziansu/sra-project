@java.lang.Override
public boolean castAtEntity(io.lumine.xikage.mythicmobs.skills.SkillMetadata data, io.lumine.xikage.mythicmobs.adapters.AbstractEntity target) {
    if (!((target.getBukkitEntity()) instanceof org.bukkit.entity.LivingEntity))
        return false;
    
    getItem(((org.bukkit.entity.LivingEntity) (target.getBukkitEntity())), this.itemString);
    return true;
}