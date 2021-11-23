public void revert() {
    if ((player) == null) {
        return ;
    }
    player.setAllowFlight(couldFly);
    player.setFlying(wasFlying);
}