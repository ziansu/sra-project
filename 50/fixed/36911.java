@org.junit.After
public void tearDown() throws java.lang.Exception {
    driver.quit();
    if ((com.iheart.junit.web_sanity.Page.getErrors().length()) > 0)
        fail(com.iheart.junit.web_sanity.Page.getErrors().toString());
    
}