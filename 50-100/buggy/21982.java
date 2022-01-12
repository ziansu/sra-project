@java.lang.Override
public void affect(lol.gameentities.CombatStat currentStat, lol.gameentities.CombatStat originStat) {
    currentStat.hp = ((int) (operator.op(currentStat.hp, originStat.hp, amount)));
    if (((currentStat.maxHp) > 0) && ((currentStat.hp) > (currentStat.maxHp))) {
        currentStat.hp = currentStat.maxHp;
    }
}