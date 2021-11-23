private byte innerTestBytesSequential() {
    for (byte[] bytes : this.bytes) {
        prng.nextBytes(bytes);
    }
    return bytes[prng.nextInt(io.github.pr0methean.betterrandom.benchmark.AbstractRandomBenchmark.COLUMNS)][prng.nextInt(io.github.pr0methean.betterrandom.benchmark.AbstractRandomBenchmark.ROWS)];
}