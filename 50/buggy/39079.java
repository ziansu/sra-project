@org.junit.Test
public void nonBinaryPrecisionTest() {
    assertEquals((0.8 / (1 + 0.8)), this.characteristic2.getPrecision(), 0.0);
}