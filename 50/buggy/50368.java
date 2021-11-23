@java.lang.Override
public void run() {
    if ((getP()) != null) {
        getP().setAllowFlight(false);
        getP().setFlying(false);
        com.walrusone.skywars.SkyWarsReloaded.getInvC().restoreInventory(getP());
    }
}