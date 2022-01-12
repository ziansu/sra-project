@org.junit.Test
public void testRoundTripOffice() throws java.lang.Exception {
    if (!(org.sagebionetworks.StackConfiguration.singleton().getOpenOfficeImageMagicePreviewsEnabled())) {
        return ;
    }
    try {
        org.sagebionetworks.repo.manager.file.preview.OfficePreviewGenerator.initialize();
    } catch (java.io.FileNotFoundException e) {
        org.junit.Assume.assumeNoException(e);
    } catch (java.lang.Exception e) {
        throw e;
    }
    testRoundTripHelper(org.sagebionetworks.file.worker.PreviewIntegrationTest.LITTLE_DOC_NAME, "application/msword");
}