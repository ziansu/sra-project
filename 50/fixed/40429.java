@org.junit.Test(expected = java.lang.RuntimeException.class)
public void testGivenExceptionTriggeringCommand() {
    fixture.givenCommands(new org.axonframework.test.FixtureTest_ExceptionHandling.CreateMyAggregateCommand("14"), new org.axonframework.test.FixtureTest_ExceptionHandling.ExceptionTriggeringCommand("14"));
}