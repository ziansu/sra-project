@org.testng.annotations.Test(groups = { "unit" }, expectedExceptions = logic.InputIsEmptyException.class)
public void failedTest() throws logic.InputIsEmptyException {
    org.testng.Assert.assertTrue(false);
}