private static boolean applyProc(thebetweenlands.gemcircle.CircleGem gem, net.minecraft.entity.Entity owner, net.minecraft.entity.Entity source, net.minecraft.entity.Entity attacker, net.minecraft.entity.Entity defender, boolean attackerProc, boolean defenderProc, float strength) {
    boolean isAttacker = owner == attacker;
    if ((isAttacker && attackerProc) || ((!isAttacker) && defenderProc)) {
        return gem.applyProc(isAttacker, owner, source, attacker, defender, strength);
    }
    return false;
}