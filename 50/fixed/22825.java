@java.lang.Override
public final boolean canAttack(final org.bukkit.entity.Player attacker, final org.bukkit.entity.Player defender) {
    return (rq.testState(attacker.getLocation(), attacker, DefaultFlag.PVP)) && (rq.testState(defender.getLocation(), defender, DefaultFlag.PVP));
}