public Common.Battle.Combatant goInOrder() {
    Common.Battle.Combatant goingNext = null;
    for (Common.Battle.Combatant comb : combatants) {
        if ((comb.ready) == false)
            continue;
        
        if ((goingNext == null) || ((comb.getSpeed()) > (goingNext.getSpeed()))) {
            comb.ready = false;
            goingNext = comb;
        }
    }
    return goingNext;
}