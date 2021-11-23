private long sendSyncMessage(tools.datasync.basic.model.SeedRecord seed, tools.datasync.basic.comm.SyncMessage syncMessage, java.lang.String message, long messageNumber) throws java.io.IOException, java.lang.InterruptedException, org.codehaus.jackson.JsonGenerationException, org.codehaus.jackson.map.JsonMappingException {
    java.lang.String payloadJson = jsonMapper.writeValueAsString(seed);
    java.lang.String payloadHash = seed.getRecordHash();
    syncMessage = createSyncMessage(seed, messageNumber, payloadJson, payloadHash);
    message = jsonMapper.writeValueAsString(syncMessage);
    tools.datasync.basic.sync.pump.SenderPostAckLogic.LOG.info(("Sending - " + message));
    this.sendQueue.put(message);
    return messageNumber;
}