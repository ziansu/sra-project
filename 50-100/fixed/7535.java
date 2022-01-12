@org.junit.Test
public void testOf_path() throws java.lang.Exception {
    io.inkstand.scribble.pdf.PDF pdf = io.inkstand.scribble.pdf.PDF.of(this.file.toPath());
    org.junit.Assert.assertNotNull(pdf);
    org.junit.Assert.assertNotNull(pdf.toDataSource());
    org.junit.Assert.assertEquals(this.file.toPath().toString(), pdf.toString());
    try (java.io.InputStream is = pdf.openStream()) {
        org.junit.Assert.assertNotNull(is);
    }
}