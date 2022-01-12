private combatSystem.CombatObj modifyStrengthsAndRollModifier(int atkStr, int defStr, combatSystem.CombatObj combat) {
    applySpecialAttacks(combat);
    applyTerrainEffects(combat);
    applyUnitTypes(atkStr, defStr, combat);
    return combat;
}