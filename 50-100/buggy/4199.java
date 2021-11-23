private void updateFleet(cyclesofwar.Player player, int force, double timeToTarget) {
    if ((this.planet.getPlayer()) == player) {
        this.forces += force;
    }else {
        this.forces -= force;
        if ((this.forces) < 0) {
            this.forcesToKeep -= this.forces;
            this.forces = 0;
        }
    }
    time = timeToTarget;
}