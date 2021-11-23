public void update(seventh.shared.TimeStep timeStep) {
    if (player.isAlive()) {
        this.memory.update(timeStep);
        this.sensors.update(timeStep);
        this.motion.update(timeStep);
        this.thoughtProcess.think(timeStep, this);
        this.targetingSystem.update(timeStep);
    }
}