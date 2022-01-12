public de.ra.simulation.Particle createParticle(double x, double y) {
    return createParticle(x, y, getParticleMass(), getParticleDensity());
}