public Common.Battle.Combatant goInOrder(Common.Battle.Combatant goingNext) {
    for (Common.Battle.Combatant comb : combatants) {
        if ((comb.ready) == false)
            continue;
        
        if ((goingNext == null) || ((comb.getSpeed()) > (goingNext.getSpeed()))) {
            comb.ready = false;
            return comb;
        }
    }
    return null;
}