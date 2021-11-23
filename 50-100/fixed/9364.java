public void causeDamage(double amount, life.grass.grasscombat.datatype.DamageType type) {
    double damage = 0.0;
    if (type.equals(DamageType.BASIC_DAMAGE)) {
        damage = life.grass.grasscombat.utils.DamageUtil.getDefencedDamage(amount, getArmorData(ArmorDataType.DEFENCE), getArmorData(ArmorDataType.PROTECTION));
    }else
        if (type.equals(DamageType.MAGIC_DAMAGE)) {
            damage = life.grass.grasscombat.utils.DamageUtil.getDefencedDamage(amount, getArmorData(ArmorDataType.MAGIC_DEFENCE), getArmorData(ArmorDataType.PROTECTION));
        }else {
            damage = amount;
        }
    
    causeRawDamage(damage);
}