@org.junit.Test
public final void testgetMessage() {
    gamelogic.TimerStrategy test = new gamelogic.TimerStrategy(gamelogic.TimerStrategyTest.COUNT);
    test.start();
    org.junit.Assert.assertEquals("Time left: 180 seconds", test.getMessage());
}