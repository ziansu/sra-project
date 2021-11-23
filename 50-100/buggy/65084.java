@org.junit.Test
public void testSetEpochObs_double() {
    java.lang.System.out.println("setEpochObs");
    double epochObs = 2000.0;
    io.github.malapert.jwcs.coordsystem.FK4NoEterms instance = new io.github.malapert.jwcs.coordsystem.FK4NoEterms();
    instance.setEpochObs(epochObs);
    double expResult = 1950.0;
    double result = instance.getEpochObs();
    assertEquals(expResult, result, 0.0);
}