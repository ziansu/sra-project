@org.junit.Test
public void file01NumberHeaderTest() {
    int expectedNChannels = 31;
    assertEquals(expectedNChannels, file01.getNumberOfChannels());
    long expectedNSamples = 227240;
    assertEquals(file01.getNumberOfSamples(), expectedNSamples);
    int expectedSamplingRate = 1000;
    assertEquals(expectedSamplingRate, file01.getSamplingRate());
}