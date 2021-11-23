@java.lang.Override
public boolean attackEntityFrom(net.minecraft.util.DamageSource damageSource, float f) {
    if ((this.entityMainTrain) != null) {
        return entityMainTrain.attackEntityFrom(damageSource, f);
    }
    return false;
}