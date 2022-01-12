@org.junit.Test
public void testRunToStableResultIsotropy() {
    final ij.ImagePlus imp = org.bonej.geometry.TestDataMaker.binaryNoise(256, 256, 256, 0.25);
    final java.lang.Object[] result = anisotropy.runToStableResult(imp, 100, 2000, 50000, (256 / 4), 2.3, 0.005, true);
    final double da = ((double[]) (result[0]))[0];
    org.junit.Assert.assertEquals(0, da, 0.01);
}