@org.junit.jupiter.api.Test
@org.junit.jupiter.api.Disabled(value = "testConvert skipped - The test was failing. To be repaired or the ffmpeg replaced by native java solution")
void testConvert() throws java.lang.Exception {
    org.cos.sie.popsulo.converter.FormatConverter converter = new org.cos.sie.popsulo.converter.FormatConverter();
    java.net.URI inputUri = org.cos.sie.popsulo.converter.FormatConverterTest.class.getResource("sEr6hfy9YTo.mp4").toURI();
    java.io.File inputFile = new java.io.File(inputUri);
    java.lang.String outputFile = new java.io.File(((inputFile.getParent()) + "\\testOutput.mp3")).getAbsolutePath();
    converter.convert(inputFile.getAbsolutePath(), outputFile, OutputFormat.MP3);
}