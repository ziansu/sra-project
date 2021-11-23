@org.junit.AfterClass
public static void tearDown() {
    voyanta.ui.baseTest.driver.quit();
    voyanta.ui.baseTest.driver = null;
}