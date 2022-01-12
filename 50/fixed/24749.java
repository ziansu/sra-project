@org.junit.Test
public void testFindFont() throws java.io.IOException {
    try (org.sejda.impl.sambox.component.PDDocumentHandler handler = new org.sejda.impl.sambox.component.PDDocumentHandler(testDoc("pdf/alphabet.pdf"))) {
        assertNotNull(handler.findFont("EDJTWM+ArialMT"));
    }
}