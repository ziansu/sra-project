@org.junit.Test
public void testSupportedFormats() {
    java.util.Set<edu.illinois.library.cantaloupe.image.Format> outputFormats = new java.util.HashSet(java.util.Arrays.asList(Format.BMP, Format.GIF, Format.JPG, Format.PNG, Format.TIF));
    assertEquals(outputFormats, edu.illinois.library.cantaloupe.processor.ImageIoImageWriter.supportedFormats());
}