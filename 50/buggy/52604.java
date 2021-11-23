public leanderk.izou.iftt.actions.ActionFlow setTargetAction(leanderk.izou.iftt.actions.TargetAction targetAction) {
    return new leanderk.izou.iftt.actions.ActionFlow(sourceAction, conditionAction, targetAction);
}