@cucumber.api.java.en.Then(value = "^returns titleCase \"([^\"]*)\"$")
public void returnsTitleCase(java.lang.String arg1) throws java.lang.Throwable {
    org.junit.Assert.assertEquals(result, arg1.equals("Y"));
}