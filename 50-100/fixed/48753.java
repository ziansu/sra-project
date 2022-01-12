public club.cogs.demos.textengine.Actions.Action chooseAction(java.util.ArrayList<club.cogs.demos.textengine.Actions.Action> actions) {
    if (actions == null)
        throw new java.lang.IllegalArgumentException();
    
    if (!(this.actionAllowed()))
        return new club.cogs.demos.textengine.Actions.Action("Wait");
    
    if ((this.randomActionAllowed()) && ((actions.size()) > 0))
        return actions.get(new java.util.Random().nextInt(actions.size()));
    
    return null;
}