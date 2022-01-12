@org.junit.Test
public void testMaxDiceResult() {
    java.lang.Integer range = dice.rollTheDice();
    junit.framework.Assert.assertEquals(dice.getResult(), range);
    org.junit.Assert.assertNotEquals(null, dice.getResult());
}