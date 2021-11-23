public static void killAllDeathGuards() {
    for (final net.wtako.WTAKODeath.Methods.DeathGuard deathGuard : net.wtako.WTAKODeath.Methods.DeathGuard.getAllDeathGuards()) {
        if (deathGuard.getDeathGuardNPC().isSpawned()) {
            if (((deathGuard.getOwner()) != null) && (deathGuard.getOwner().isOnline())) {
                deathGuard.giveBack();
            }else {
                deathGuard.destroy();
            }
        }
    }
    net.wtako.WTAKODeath.Methods.DeathGuard.getAllDeathGuards().clear();
}