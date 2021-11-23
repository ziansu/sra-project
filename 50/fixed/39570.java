@org.testng.annotations.AfterMethod
public void tearDown() {
    this.control = null;
    this.connection = null;
}