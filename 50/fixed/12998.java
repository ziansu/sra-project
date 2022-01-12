@org.junit.Test
public void distanceToOurself() throws java.lang.Exception {
    eu.mivrenik.particles.model.Particle particle = particleGenerator.nextParticle();
    org.junit.Assert.assertEquals(0.0, particle.getDistanceTo(particle), eps);
}