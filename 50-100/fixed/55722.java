@org.junit.Before
public void createProcessor() throws java.io.IOException {
    processor = new org.opentestsystem.rdw.ingest.group.GroupProcessorConfiguration(groupProcessor, repository);
    groupMessage = org.opentestsystem.rdw.ingest.common.model.GroupMessage.builder().digest("abcdef").uploadId(123L).build();
    final org.opentestsystem.rdw.messaging.RdwMessageHeaderAccessor accessor = org.opentestsystem.rdw.messaging.RdwMessageHeaderAccessor.wrap(null);
    accessor.setImportId(123L);
    accessor.setContentType(MediaType.APPLICATION_JSON);
    message = new org.springframework.messaging.support.GenericMessage(groupMessage.toJson().getBytes("UTF-8"), accessor.getMessageHeaders());
}