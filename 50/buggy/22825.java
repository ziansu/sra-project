@java.lang.Override
public final boolean canAttack(final org.bukkit.entity.Player attacker, final org.bukkit.entity.Player defender) {
    boolean flag = rq.testState(defender.getLocation(), defender, DefaultFlag.PVP);
    return flag;
}