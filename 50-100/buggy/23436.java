protected void advance(com.elmakers.mine.bukkit.api.action.CastContext context) {
    (currentAction)++;
    context.performedActions(1);
    if ((currentAction) >= (actions.size())) {
        currentAction = null;
    }else {
        actions.get(currentAction).getAction().reset(context);
    }
}