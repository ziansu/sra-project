public battle.dynamic.CompleteDamage damageVsEnemy(battle.dynamic.ResistanceModifiers resistMod, double rawPhysicalDamage, double rawMagicDamage, double enemyBaseArmor, double enemyBonusArmor, double enemyBaseMR, double enemyBonusMR) {
    double realArmor = resistMod.getTrueEnemyArmor(enemyBaseArmor, enemyBonusArmor);
    double realMR = resistMod.getTrueEnemyMR(enemyBaseMR, enemyBonusMR);
    double realPhysicalDamageDealt = rawPhysicalDamage * (100 / (100 + realArmor));
    double realMagicDamageDealt = rawMagicDamage * (100 / (100 + realMR));
    return new battle.dynamic.CompleteDamage(resistMod.getName(), realPhysicalDamageDealt, realMagicDamageDealt);
}