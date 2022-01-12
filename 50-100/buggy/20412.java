public void executeTactics() {
    boolean allReady = true;
    for (Common.Battle.Combatant comb : combatants) {
        if ((comb.ready) == false) {
            java.lang.System.err.println((("Error: " + (comb.getName())) + " is not ready"));
            allReady = false;
        }
    }
    if (!allReady)
        return ;
    
    Common.Battle.Combatant goingNext = goInOrder();
    while (goingNext != null) {
        goingNext.useAbility();
    } 
}