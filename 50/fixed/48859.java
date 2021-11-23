@org.openjdk.jmh.annotations.Benchmark
public byte testBytesContended() throws io.github.pr0methean.betterrandom.seed.SeedException, java.lang.InterruptedException {
    return innerTestBytesContended();
}