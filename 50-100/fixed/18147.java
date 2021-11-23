private void updateFleet(cyclesofwar.Player player, int force, double timeToTarget) {
    if ((this.planetOwner) == player) {
        this.forces += force;
    }else {
        this.forces -= force;
        if ((this.forces) < 0) {
            this.planetOwner = player;
            this.forces = -(this.forces);
        }
    }
}