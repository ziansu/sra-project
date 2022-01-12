@org.junit.Test
public void distanceBetweenParticlesWithSameCoordinates() throws java.lang.Exception {
    double newX = generateDouble((-10), 10);
    double newY = generateDouble((-10), 10);
    eu.mivrenik.particles.model.Particle particle1 = particleGenerator.nextParticleSpecifiedCoordinates(newX, newY);
    eu.mivrenik.particles.model.Particle particle2 = particleGenerator.nextParticleSpecifiedCoordinates(newX, newY);
    org.junit.Assert.assertEquals(0.0, particle1.getDistanceTo(particle2), eps);
}