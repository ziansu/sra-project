@java.lang.Override
protected int calcPower(net.wombatrpgs.saga.rpg.battle.Battle battle, net.wombatrpgs.saga.rpg.chara.Chara user) {
    java.lang.String tab = net.wombatrpgs.saga.core.SConstants.TAB;
    if ((lastUsedBattle) == battle) {
        seqIndex += 1;
    }else {
        lastUsedBattle = battle;
        seqIndex = 0;
    }
    seqIndex = (seqIndex) % (sequence.length);
    int hits = sequence[seqIndex];
    battle.println((((tab + "Hit ") + hits) + " times."));
    return (statDamage(user, mdo.attackStat, mdo.power)) * hits;
}