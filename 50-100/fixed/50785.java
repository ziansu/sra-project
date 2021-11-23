@org.junit.Test
public void shouldReturnCorrectChangeDueAs50Cents() {
    java.util.ArrayList<Coin> coins = new java.util.ArrayList<Coin>();
    Chips bagOfChips = new Chips(0.5);
    coins = underTest.queueCoins(quarter, quarter, dime, dime, dime, nickel, nickel, nickel, penny, penny, penny, penny, penny);
    double expected = 0.5;
    assertEquals(expected, underTest.calcChangeDue(coins, bagOfChips), 0);
}