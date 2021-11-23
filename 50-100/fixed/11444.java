@org.junit.Test
public void testAddBlankPageIfOdd() throws java.io.IOException {
    try (org.sejda.impl.sambox.component.PDDocumentHandler handler = new org.sejda.impl.sambox.component.PDDocumentHandler()) {
        assertNull(handler.addBlankPageIfOdd(new org.sejda.sambox.pdmodel.common.PDRectangle(10, 10)));
        handler.addBlankPage(new org.sejda.sambox.pdmodel.common.PDRectangle(10, 10));
        assertNotNull(handler.addBlankPageIfOdd(new org.sejda.sambox.pdmodel.common.PDRectangle(10, 10)));
    }
}