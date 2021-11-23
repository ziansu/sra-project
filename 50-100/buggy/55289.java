public com.dd.Stats getNegStatChange() {
    int negHealth = (-1) * (StatModifyer.getHealth());
    int negMaxHealth = (-1) * (StatModifyer.getMaxHealth());
    int negAttack = (-1) * (StatModifyer.getAttack());
    int negDefense = (-1) * (StatModifyer.getDefense());
    com.dd.Stats negStats = new com.dd.Stats(negHealth, negMaxHealth, negAttack, negDefense);
    return negStats;
}