@org.junit.Test
public void testSameSize() {
    java.awt.Image image = new java.awt.image.BufferedImage(320, 200, java.awt.image.BufferedImage.TYPE_INT_RGB);
    org.encog.util.downsample.RGBDownsample ds = new org.encog.util.downsample.RGBDownsample();
    double[] d = ds.downSample(image, 200, 320);
    junit.framework.Assert.assertEquals(192000, d.length);
}