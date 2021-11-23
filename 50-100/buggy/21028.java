@org.junit.Test
public void layoutAndMode() {
    org.sejda.impl.sambox.component.PDDocumentHandler victim = new org.sejda.impl.sambox.component.PDDocumentHandler();
    victim.initialiseBasedOn(new org.sejda.sambox.pdmodel.PDDocument());
    org.junit.Assert.assertFalse(victim.getUnderlyingPDDocument().getDocumentCatalog().getCOSObject().containsKey(COSName.PAGE_LAYOUT));
    org.junit.Assert.assertFalse(victim.getUnderlyingPDDocument().getDocumentCatalog().getCOSObject().containsKey(COSName.PAGE_MODE));
}