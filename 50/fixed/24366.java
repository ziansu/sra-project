@org.junit.Test
public final void getMessage() {
    gamelogic.StepStrategy test = new gamelogic.StepStrategy(gamelogic.StepStrategyTest.COUNT);
    test.start();
    org.junit.Assert.assertEquals("Steps left: 50", test.getMessage());
}