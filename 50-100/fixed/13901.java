public void testGetCorrect() {
    common.messages.MessageType message = new common.messages.MessageType("get key", false);
    assertTrue(message.isValid);
    assertEquals("get", message.getHeader());
    assertEquals("key", message.getKey());
    assertEquals("get key", message.getMsg());
}