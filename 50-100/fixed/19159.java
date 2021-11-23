@org.junit.Test
public void testCounterShouldBeCreatedWithInitialValueAndStepSize() {
    Counter counter = new Counter(9, 3);
    counter.increase();
    assertEquals(12, counter.getValue());
    counter.decrease();
    counter.decrease();
    assertEquals(6, counter.getValue());
}