protected boolean exchangePossible() {
    return (target.getCurrentRegion().connectsByBridge(occupancy.getRegion())) || ((target.getCurrentRegion()) == (occupancy.getRegion()));
}