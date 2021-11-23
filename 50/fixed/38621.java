@edu.uci.python.test.benchmarks.Test
public void pidigits_timed() {
    java.nio.file.Path script = java.nio.file.Paths.get("pidigits-timed.py");
    assertBenchNoError(script, new java.lang.String[]{ "0" });
}