@org.junit.BeforeClass
public static void setupTest() throws java.lang.Exception {
    setupBatchArtifacts(co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.BATCH_APP_ARTIFACT_ID, co.cask.cdap.datapipeline.DataPipelineApp.class);
    addPluginArtifact(NamespaceId.DEFAULT.artifact("core-plugins", "1.0.1"), co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.BATCH_APP_ARTIFACT_ID, co.cask.hydrator.plugin.batch.source.XMLReaderBatchSource.class);
    co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.sourceFolder = co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.temporaryFolder.newFolder("xmlSourceFolder");
    co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.targetFolder = co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.temporaryFolder.newFolder("xmlTargetFolder");
    co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.sourceFolderUri = co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.sourceFolder.toURI().toString();
    co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.targetFolderUri = co.cask.hydrator.plugin.batch.source.BatchXMLFileFilterTest.targetFolder.toURI().toString();
}