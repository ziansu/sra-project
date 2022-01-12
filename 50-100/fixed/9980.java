public static games.strategy.triplea.ai.proAI.data.ProBattleResult calculateBattleResults(final games.strategy.engine.data.PlayerID player, final games.strategy.engine.data.Territory t, final java.util.List<games.strategy.engine.data.Unit> attackingUnits, final java.util.List<games.strategy.engine.data.Unit> defendingUnits, final java.util.Set<games.strategy.engine.data.Unit> bombardingUnits, final boolean isAttacker) {
    final games.strategy.triplea.ai.proAI.data.ProBattleResult result = games.strategy.triplea.ai.proAI.util.ProBattleUtils.checkIfNoAttackersOrDefenders(t, attackingUnits, defendingUnits);
    if (result != null) {
        return result;
    }
    return games.strategy.triplea.ai.proAI.util.ProBattleUtils.callBattleCalculator(player, t, attackingUnits, defendingUnits, bombardingUnits);
}