@org.junit.Test
public void sortsReverseWithZeroParticles() throws java.lang.Exception {
    arturpopov.basicprojectopengles.ParticleGenerator gen = new arturpopov.basicprojectopengles.ParticleGenerator(new android.test.mock.MockContext());
    java.util.List<arturpopov.basicprojectopengles.Particle> expected = java.util.Arrays.asList();
    java.util.List<arturpopov.basicprojectopengles.Particle> exampleList = java.util.Arrays.asList();
    gen.mParticleContainer = exampleList;
    arturpopov.basicprojectopengles.Particle.sortParticles(gen.mParticleContainer);
    java.util.List<arturpopov.basicprojectopengles.Particle> actual = gen.mParticleContainer;
    org.junit.Assert.assertArrayEquals(expected.toArray(), actual.toArray());
}