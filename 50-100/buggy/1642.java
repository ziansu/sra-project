@org.testng.annotations.Test(timeOut = 15000)
public void testGenerator() {
    try {
        final io.github.pr0methean.betterrandom.seed.SeedGenerator generator = DevRandomSeedGenerator.DEV_RANDOM_SEED_GENERATOR;
        final byte[] seed = generator.generateSeed(32);
        assert (seed.length) == 32 : "Failed to generate seed of correct length";
    } catch (final io.github.pr0methean.betterrandom.seed.SeedException ex) {
        assert !(new java.io.File("/dev/random").exists()) : "Seed generator failed even though /dev/random exists.";
        org.testng.Reporter.log("/dev/random does not exist on this platform.");
    }
}