@org.junit.Test
public void testBet() {
    int testBetAmount;
    p.money = 10;
    p.isBet = 0;
    p.betAmount = 2;
    p.bet();
    assert (p.money) == ((p.money) - (p.betAmount));
    assert (p.isBet) == ((p.isBet) + (p.betAmount));
    p.money = 1;
    p.bet();
    assert java.lang.System.out.equals("Not enough money");
}