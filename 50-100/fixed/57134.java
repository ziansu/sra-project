@java.lang.Override
protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3);
    getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0);
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0);
}