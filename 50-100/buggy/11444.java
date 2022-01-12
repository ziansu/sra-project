@org.junit.Test
public void testAddBlankPageIfOdd() throws java.io.IOException {
    try (org.sejda.impl.sambox.component.PDDocumentHandler handler = new org.sejda.impl.sambox.component.PDDocumentHandler()) {
        org.junit.Assert.assertNull(handler.addBlankPageIfOdd(new org.sejda.sambox.pdmodel.common.PDRectangle(10, 10)));
        handler.addBlankPage(new org.sejda.sambox.pdmodel.common.PDRectangle(10, 10));
        org.junit.Assert.assertNotNull(handler.addBlankPageIfOdd(new org.sejda.sambox.pdmodel.common.PDRectangle(10, 10)));
    }
}