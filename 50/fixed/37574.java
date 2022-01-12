@org.junit.After
public void testShutDown() {
    driver.close();
    java.lang.System.out.println("Driver closed after test");
}