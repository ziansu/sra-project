public boolean isEnabled(java.lang.Class<? extends com.massisframework.massis.sim.ecs.SimulationSystem> state) {
    return (this.hasSystem(state)) && (this.disabled.contains(state));
}