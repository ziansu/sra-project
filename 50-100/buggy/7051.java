@org.junit.Test
public void layoutAndModeSet() {
    org.sejda.sambox.pdmodel.PDDocument doc = new org.sejda.sambox.pdmodel.PDDocument();
    doc.getDocumentCatalog().setPageLayout(PageLayout.TWO_COLUMN_RIGHT);
    doc.getDocumentCatalog().setPageMode(PageMode.USE_OUTLINES);
    org.sejda.impl.sambox.component.PDDocumentHandler victim = new org.sejda.impl.sambox.component.PDDocumentHandler();
    victim.initialiseBasedOn(doc);
    org.junit.Assert.assertEquals(PageLayout.TWO_COLUMN_RIGHT, victim.getUnderlyingPDDocument().getDocumentCatalog().getPageLayout());
    org.junit.Assert.assertEquals(PageMode.USE_OUTLINES, victim.getUnderlyingPDDocument().getDocumentCatalog().getPageMode());
}