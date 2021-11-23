@org.testng.annotations.Test
public void testM2Gb() throws java.lang.Exception {
    smartAssert(((-1L) << 31), "-2Gb");
}