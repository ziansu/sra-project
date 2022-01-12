@java.lang.Override
public boolean pickupCrate(ballmerpeak.stargate.Player player) {
    boolean didPickUpCrate = super.pickupCrate(player);
    if (didPickUpCrate) {
        getDoor().close();
        if ((player.getTile()) == (door)) {
            player.kill();
        }
        return true;
    }
    return false;
}