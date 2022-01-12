@java.lang.Override
protected logic.game.RoundStatus whenActionStart() {
    for (logic.unit.player.Player now : defender) {
        if ((now instanceof logic.unit.player.SoliderPlayer) && ((now.getEquip()) != null)) {
            now.attachBuff(now.getEquip().getDefence());
        }
    }
    for (int i = 0; i < (defenderOldHp.length); i++) {
        defenderOldHp[i] = defender[i].getAttribute().getAttribute(AttributeType.HP);
    }
    return RoundStatus.ACTION;
}