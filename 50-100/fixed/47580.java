@com.artfulbits.benchmark.Test
public void test_05_CustomOutput() {
    final com.artfulbits.benchmark.Meter meter = com.artfulbits.benchmark.Meter.getInstance();
    meter.setOutput(mOutput);
    assertNotNull("Expected instance of the output provider", meter.getOutput());
    assertEquals("Expected same instance", mOutput, meter.getOutput());
    meter.start("→ Custom output");
    android.os.SystemClock.sleep(100);
    meter.finish("← Custom output");
    assertTrue("Expected not empty logs", ((mOutput.toString().length()) > 0));
}