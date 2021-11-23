public void execute(Model.Action action) throws java.lang.Exception {
    boolean haveExecute = false;
    java.util.Iterator<Model.Action> iterator = actions.iterator();
    while (iterator.hasNext()) {
        Model.Action currentAction = iterator.next();
        if (action.equals(currentAction)) {
            currentAction.execute(this);
            haveExecute = true;
            break;
        }
    } 
    if (!haveExecute) {
        throw new java.lang.Exception("No valid action");
    }
}