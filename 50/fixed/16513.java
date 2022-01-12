@org.junit.Test
public void shouldReturnQuarterValue() {
    Coin quarter = new Coin(4, 4);
    double result = 0.25;
    assertEquals(result, underTest.identifyCoin(quarter), 0);
}