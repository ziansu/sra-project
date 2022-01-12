@com.bf.benchmark.Benchmark
public void mandelbrot(org.openjdk.jmh.infra.Blackhole hole) {
    java.lang.System.out.println();
    hole.consume(callTarget.call());
}