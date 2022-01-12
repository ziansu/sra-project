@java.lang.Override
public battle.CombatantInterface selectTarget(java.util.List<battle.CombatantInterface> combatants) {
    for (battle.CombatantInterface c : combatants) {
        if (!(c.isType(_type))) {
            return c;
        }
    }
    return null;
}