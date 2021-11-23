@org.junit.Test
public void testKeyToNodePathWithNullBasePath() {
    com.adobe.acs.commons.mcp.impl.processes.S3AssetIngestor ingestor = new com.adobe.acs.commons.mcp.impl.processes.S3AssetIngestor(null);
    ingestor.jcrBasePath = "/content/dam";
    assertEquals("/content/dam/folder1", ingestor.keyToNodePath("folder1/"));
    assertEquals("/content/dam/folder1", ingestor.keyToNodePath("folder1"));
    assertEquals("/content/dam/folder1/folder2/folder3", ingestor.keyToNodePath("folder1/folder2/folder3/"));
    assertEquals("/content/dam/folder1/folder2/folder_3", ingestor.keyToNodePath("folder1/folder2/folder 3/"));
}