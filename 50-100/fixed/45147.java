public source.CombatResult usePotion(source.Potion item) {
    source.CombatResult result = new source.CombatResult();
    if ((item.getType()) == (Types.itemType.Potion)) {
        result.setPlayerAction(Types.combatActionResult.ItemUsed);
        source.Player.getInstance().setLife(((source.Player.getInstance().getLife()) + (item.getHealing())));
    }
    if ((CurrentEnemy.getLife()) > 0)
        result = enemyMove(result);
    
    return endRound(result);
}