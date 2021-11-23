@org.junit.Test(expected = org.axonframework.test.FixtureExecutionException.class)
public void testWhenCommandWithInvalidIdentifier() {
    fixture.givenCommands(new org.axonframework.test.FixtureTest_ExceptionHandling.CreateMyAggregateCommand("1"), new org.axonframework.test.FixtureTest_ExceptionHandling.ValidMyAggregateCommand("2"));
}