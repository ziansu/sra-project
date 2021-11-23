public void addParticle(team316.navigation.ParticleType type, battlecode.common.MapLocation location, int lifetime) {
    if (((numParticles) + 1) == (team316.navigation.PotentialField.PARTICLE_LIMIT)) {
        java.lang.System.out.println("Compresssing!");
        compressParticles();
    }
    particles[numParticles] = config.particle(type, location, lifetime);
    ++(numParticles);
}