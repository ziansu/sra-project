public void applyCurrent(org.openpixi.pixi.physics.Simulation s) {
    evolveCharges(s);
    removeParticles(s);
    interpolateChargesAndCurrents(s);
}