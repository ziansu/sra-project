@org.junit.After
public void testShutDown() {
    driver.close();
    java.lang.System.out.print("Driver closed after test");
}