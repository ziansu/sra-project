@cucumber.api.java.en.Then(value = "^after checking two number to be equal result should be \"([^\"]*)\"$")
public void afterCheckingTwoNumberToBeEqualResultShouldBe(final java.lang.String arg1) throws java.lang.Throwable {
    org.junit.Assert.assertEquals(result, arg1.equals("Y"));
}