public void step() {
    if (!((actionIterator) < (gene.actions.size())))
        resetActionIterator();
    
    net.net16.jeremiahlowe.fighters.fighter.ActionBase action = gene.actions.get(actionIterator);
    if (action != null) {
        performAction(action);
        (actionIterator)++;
    }
}