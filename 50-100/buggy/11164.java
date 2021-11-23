public com.dumbpug.crossbowknight.particles.Particle generate(com.dumbpug.crossbowknight.particles.EmitterDetails emitterDetails) {
    float randomVelx = ((random.nextFloat()) * 4.0F) - 2.0F;
    float randomVely = ((random.nextFloat()) * 4.0F) - 2.0F;
    return new com.dumbpug.crossbowknight.particles.ExplosionParticle(((emitterDetails.positionX) - 10), emitterDetails.positionY, randomVelx, randomVely, level);
}