@org.junit.Test
public void testRowSpacingAndFooter() throws java.io.IOException, org.daisy.dotify.api.engine.LayoutEngineException, org.daisy.dotify.api.writer.PagedMediaWriterConfigurationException {
    testPEF("resource-files/dp2/row-spacing-and-footer-input.obfl", "resource-files/dp2/row-spacing-and-footer-expected.pef", false);
}