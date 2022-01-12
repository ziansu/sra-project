protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.40000001192092893);
    this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1150.0);
    this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
    this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0);
}