@org.junit.Test
public void testNext() throws java.io.IOException {
    hipi.imagebundle.AbstractImageBundle aib = createImageBundleAndOpen(AbstractImageBundle.FILE_MODE_READ);
    hipi.image.io.ImageDecoder decoder = hipi.image.io.JPEGImageUtil.getInstance();
    aib.next();
    aib.next();
    hipi.image.FloatImage source = decoder.decodeImage(new java.io.FileInputStream("data/test/ImageBundleTestCase/read/1.jpg"));
    hipi.image.FloatImage image = aib.getCurrentImage();
    assertEquals("skip image fails", source, image);
    aib.close();
}