@org.openjdk.jmh.annotations.Benchmark
public void testBytesSequential(io.github.pr0methean.betterrandom.benchmark.AbstractRandomBenchmark.PrngState state) throws io.github.pr0methean.betterrandom.seed.SeedException {
    innerTestBytesSequential(state.prng);
}