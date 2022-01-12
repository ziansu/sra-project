@org.junit.Test
public void testOf_file() throws java.lang.Exception {
    io.inkstand.scribble.pdf.PDF pdf = io.inkstand.scribble.pdf.PDF.of(this.file);
    org.junit.Assert.assertNotNull(pdf);
    org.junit.Assert.assertNotNull(pdf.toDataSource());
    try (java.io.InputStream is = pdf.openStream()) {
        org.junit.Assert.assertNotNull(is);
    }
}