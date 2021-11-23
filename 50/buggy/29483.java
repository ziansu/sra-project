@org.junit.Test
public void layerTest() {
    com.layer.sdk.messaging.Conversation conversation = org.mockito.Mockito.mock(com.layer.sdk.messaging.Conversation.class);
    org.mockito.Mockito.doReturn(3).when(conversation.getTotalMessageCount());
    int messages = conversation.getTotalMessageCount();
    assertEquals(3, messages);
}