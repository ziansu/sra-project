@java.lang.Override
public boolean attackEntityFrom(net.minecraft.util.DamageSource source, float damage) {
    if (defense.common.DamageUtility.canHarm(this, source, damage)) {
        damage += damage;
        if (damage >= (max_damage)) {
            setDead();
        }
        return true;
    }
    return false;
}