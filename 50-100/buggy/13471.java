@java.lang.Override
protected void doStepAction() throws pool.action.exception.ActionFinishedException {
    pool.action.Action action = this.actions.get((((this.indexOfCurrentAction)++) % (this.actions.size())));
    action.doStep();
    this.removeActionIfFinished(action);
}