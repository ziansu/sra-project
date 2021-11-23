public leanderk.izou.iftt.actions.ActionFlow setSourceAction(leanderk.izou.iftt.actions.SourceAction sourceAction) {
    return new leanderk.izou.iftt.actions.ActionFlow(sourceAction, conditionAction, targetAction);
}