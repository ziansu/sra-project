@java.lang.Override
public boolean attackEntityFrom(net.minecraft.util.DamageSource source, float amount) {
    if ((source.isProjectile()) && ((source.getSourceOfDamage().getClass()) == (com.ships.Enities.SpecialArrowEntity.class))) {
        super.attackEntityFrom(source, amount);
        return true;
    }
    return false;
}