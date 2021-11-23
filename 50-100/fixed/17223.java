protected java.util.UUID selectDefenderForAllAttack(java.util.Set<java.util.UUID> defenders, mage.game.Game game) {
    mage.target.common.TargetDefender target = new mage.target.common.TargetDefender(defenders, null);
    target.setNotTarget(true);
    if (chooseTarget(Outcome.Damage, target, null, game)) {
        return response.getUUID();
    }
    return null;
}