@org.junit.Test
public void testRunToStableResultAnisotropy() {
    final ij.ImagePlus imp = org.bonej.geometry.TestDataMaker.plates(256, 256, 256, 8);
    final java.lang.Object[] result = anisotropy.runToStableResult(imp, 100, 2000, 50000, (256 / 4), 2.3, 0.005, false);
    final double da = ((double[]) (result[0]))[0];
    org.junit.Assert.assertEquals(1, da, 1.0E-12);
}