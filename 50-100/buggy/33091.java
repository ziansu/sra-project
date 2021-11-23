public void fighterInitRollUpdate(java.lang.String combatHandle, java.lang.Integer init) {
    if (getRoster().containsKey(combatHandle)) {
        cm.model.Combatant fighter = getRoster().get(combatHandle);
        fighterInitUpdate(combatHandle, fighter.getRound(), fighter.getInitRoll(), fighter.getRandom3(), true);
        if (fighter.getCombatHandle().contentEquals(getCurrentFighterHandle())) {
            fighterStartTurn(getCurrentFighterHandle());
        }
    }
}