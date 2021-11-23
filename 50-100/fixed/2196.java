public void testCaseDoing(com.example.tests.UseTestCaseClass useTestCaseClass) {
    try {
        assertEquals(useTestCaseClass.getLabelTextParagraph(), com.example.fw.ApplicationManager.driver.findElement(org.openqa.selenium.By.cssSelector(useTestCaseClass.getLabelTestSelector())).getText());
    } catch (java.lang.Error e) {
        com.example.fw.ApplicationManager.verificationErrors.append(e.toString());
    }
}