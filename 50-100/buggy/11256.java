@org.testng.annotations.Test
public void testLongs2() throws java.lang.Exception {
    final io.github.pr0methean.betterrandom.prng.BaseRandom prng = createRng();
    io.github.pr0methean.betterrandom.prng.RandomTestUtils.checkStream(prng, 42, prng.longs((1L << 40), (1L << 42)), (-1), (1 << 40), (1 << 42), alwaysCheckEntropy());
}