@org.junit.Test
public void registerNewDevice() throws java.lang.Exception {
    com.stacksync.commons.models.ItemMetadata file = new com.stacksync.commons.models.ItemMetadata();
    file.setId(118L);
    file.setFilename("chunks-2.png");
    file.setParentId(null);
    com.stacksync.syncservice.rpc.messages.APICommitResponse response = com.stacksync.syncservice.test.handler.UpdateMetadataTest.handler.updateMetadata(com.stacksync.syncservice.test.handler.UpdateMetadataTest.user1, file, false);
    java.lang.System.out.println(response.toString());
}