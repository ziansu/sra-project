private byte innerTestBytesSequential() {
    for (byte[] bytes : io.github.pr0methean.betterrandom.benchmark.AbstractRandomBenchmark.bytes) {
        prng.nextBytes(bytes);
    }
    return io.github.pr0methean.betterrandom.benchmark.AbstractRandomBenchmark.bytes[prng.nextInt(io.github.pr0methean.betterrandom.benchmark.AbstractRandomBenchmark.COLUMNS)][prng.nextInt(io.github.pr0methean.betterrandom.benchmark.AbstractRandomBenchmark.ROWS)];
}