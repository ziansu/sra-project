@java.lang.Override
public void run() {
    if ((getP()) != null) {
        getP().setAllowFlight(state);
        getP().setFlying(state);
        com.walrusone.skywars.SkyWarsReloaded.getInvC().restoreInventory(getP());
    }
}