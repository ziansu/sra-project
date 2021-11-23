@java.lang.Override
public boolean attackEntityAsMob(net.minecraft.entity.Entity entity) {
    boolean entityFrom = entity.attackEntityFrom(net.minecraft.util.DamageSource.causeMobDamage(this), ((float) ((int) (getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()))));
    if (entityFrom) {
        applyEnchantments(this, entity);
    }
    return entityFrom;
}