void land(cyclesofwar.Fleet fleet) {
    if ((player) == (fleet.getPlayer())) {
        forces += fleet.getForce();
    }else {
        forces -= fleet.getForce();
    }
    if ((forces) < 0) {
        forces = -(forces);
        this.player = fleet.getPlayer();
        lastTimeOwnershipChanged = universe.getNow();
    }
}