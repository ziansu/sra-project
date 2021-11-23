@java.lang.Override
public boolean castAtEntity(io.lumine.xikage.mythicmobs.skills.SkillMetadata data, io.lumine.xikage.mythicmobs.adapters.AbstractEntity target) {
    io.lumine.xikage.mythicmobs.skills.SkillCaster caster = data.getCaster();
    if (!((caster.getEntity().getBukkitEntity()) instanceof org.bukkit.entity.LivingEntity))
        return false;
    
    getItem(((org.bukkit.entity.LivingEntity) (caster.getEntity().getBukkitEntity())), this.itemString);
    return true;
}