public void testGetCorrect() {
    common.messages.MessageType message = new common.messages.MessageType("get key");
    assertEquals("get key", message.getMsg());
    assertEquals("get", message.getHeader());
    assertEquals("key", message.getKey());
    assertTrue(message.isValid);
}