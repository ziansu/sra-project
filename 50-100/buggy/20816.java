@org.junit.Ignore
@org.junit.Test
public void testFromFolder() throws java.lang.Exception {
    final ro.isdc.wro.model.resource.processor.ResourcePreProcessor processor = new ro.isdc.wro.manager.TestWroManager.WroManagerProcessor();
    final java.net.URL url = getClass().getResource("wroManager");
    final java.io.File testFolder = new java.io.File(url.getFile(), "test");
    final java.io.File expectedFolder = new java.io.File(url.getFile(), "expected");
    ro.isdc.wro.util.WroTestUtils.compareFromDifferentFoldersByExtension(testFolder, expectedFolder, "js", processor);
    ro.isdc.wro.util.WroTestUtils.compareFromDifferentFoldersByExtension(testFolder, expectedFolder, "css", processor);
}