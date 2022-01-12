@java.lang.Override
public boolean attackEntityAsMob(net.minecraft.entity.Entity par1Entity) {
    setLastAttackedEntity(par1Entity);
    return false;
}