@org.junit.Before
public void baseSetup() throws java.lang.Exception {
    java.lang.System.out.println("setting up base test bench case");
    setDriver(com.vaadin.testbench.TestBench.createDriver(createFirefoxDriver()));
    getDriver().manage().window().setPosition(new org.openqa.selenium.Point(0, 0));
    getDriver().manage().window().setSize(new org.openqa.selenium.Dimension(1024, 768));
    java.lang.System.out.println("default driver added");
    addDriver(getDriver());
    currentDriverIndex = 1;
    java.lang.System.out.println(("current driver index set to " + (currentDriverIndex)));
}