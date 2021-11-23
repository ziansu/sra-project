@org.junit.Test
public void testMinDiceResult() {
    java.lang.Integer range = dice.rollTheDice();
    junit.framework.Assert.assertEquals(dice.getResult(), range);
}