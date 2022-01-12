@cucumber.api.java.en.Then(value = "I check presence of ([^\"]*) element")
public void I_check_presence_of_inbox_element(java.lang.String element) throws java.lang.InterruptedException {
    java.lang.System.out.println("going to check presence of element");
    boolean result = selenium.isElementPresent(element);
    java.lang.String actual_result = null;
    if (result)
        java.lang.System.out.println("yeah");
    else
        org.junit.Assert.assertTrue("Checking", false);
    
}