@java.lang.Override
public org.gots.action.ActionOnSeed doAction(org.gots.action.ActionOnSeed action, org.gots.seed.GrowingSeed seed) {
    action.setDateActionDone(java.util.Calendar.getInstance().getTime());
    action.setActionSeedId(seed.getSeedId());
    seed.getActionToDo().remove(action);
    seed.getActionDone().add(action);
    return provider.doAction(action, seed);
}