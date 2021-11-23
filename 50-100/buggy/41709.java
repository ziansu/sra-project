@org.testng.annotations.Test
public void testLongs3() throws java.lang.Exception {
    final io.github.pr0methean.betterrandom.prng.BaseRandom prng = createRng();
    io.github.pr0methean.betterrandom.prng.RandomTestUtils.checkStream(prng, 42, prng.longs(20, (1L << 40), (1L << 42)), 20, (1 << 40), (1 << 42), alwaysCheckEntropy());
}