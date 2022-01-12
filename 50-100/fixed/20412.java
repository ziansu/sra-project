public void executeTactics() {
    boolean allReady = true;
    for (Common.Battle.Combatant comb : combatants) {
        if ((comb.ready) == false) {
            java.lang.System.out.println((("Error: " + (comb.getName())) + " is not ready"));
            allReady = false;
        }
    }
    if (!allReady)
        return ;
    
    Common.Battle.Combatant goingNext = null;
    goingNext = goInOrder(goingNext);
    while (goingNext != null) {
        goingNext.useAbility();
        goingNext = goInOrder(goingNext);
    } 
}