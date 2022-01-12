@java.lang.Override
public boolean attackEntityFrom(net.minecraft.util.DamageSource source, float damage) {
    if (defense.common.DamageUtility.canHarm(this, source, damage)) {
        this.damage += damage;
        if ((this.damage) >= (this.max_damage)) {
            this.setDead();
        }
        return true;
    }
    return false;
}