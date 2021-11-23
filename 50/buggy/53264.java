@java.lang.Override
public boolean attackEntityAsMob(net.minecraft.entity.Entity par1Entity) {
    setLastAttackedEntity(par1Entity);
    return par1Entity.attackEntityFrom(net.minecraft.util.DamageSource.causeMobDamage(this), ((float) (getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getBaseValue())));
}