@org.junit.Test
public void file01NumberHeaderTest() {
    int expectedNChannels = 31;
    assertEquals(expectedNChannels, this.file01.getNumberOfChannels());
    long expectedNSamples = 227240;
    assertEquals(this.file01.getNumberOfSamples(), expectedNSamples);
    int expectedSamplingRate = 1000;
    assertEquals(expectedSamplingRate, this.file01.getSamplingRate());
}