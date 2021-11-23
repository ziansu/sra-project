@edu.uci.python.test.benchmarks.Test
public void pads_integerpartitions() {
    java.nio.file.Path script = java.nio.file.Paths.get("pads-integerpartitions.py");
    assertBenchNoError(script, "700");
}