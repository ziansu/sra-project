@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testMarginOutOfLowerBounds() {
    this.assertMarginToday("12:00", "12:00", (-10), true);
}