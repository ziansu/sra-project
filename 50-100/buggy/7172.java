private boolean canAttack(final me.NoChance.PvPManager.PvPlayer attacker, final me.NoChance.PvPManager.PvPlayer defender) {
    if (!((attacker.isInCombat()) && (defender.isInCombat())))
        return false;
    
    return dependencyManager.canAttack(attacker.getPlayer(), defender.getPlayer());
}