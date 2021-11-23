@org.junit.Test
public void runArgsTest() {
    com.laboon.CoffeeMaker testcm = new com.laboon.CoffeeMaker();
    java.lang.String arg = "string";
    int retval = testcm.runArgs(arg);
    assertEquals(retval, 0);
}