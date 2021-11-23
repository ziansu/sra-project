public com.dumbpug.crossbowknight.particles.Particle generate(com.dumbpug.crossbowknight.particles.EmitterDetails emitterDetails) {
    float randomVelx = ((random.nextFloat()) * 2.0F) - 1.0F;
    float randomVely = ((random.nextFloat()) * 2.0F) - 1.0F;
    return new com.dumbpug.crossbowknight.particles.ExplosionParticle(emitterDetails.positionX, emitterDetails.positionY, randomVelx, randomVely, level);
}