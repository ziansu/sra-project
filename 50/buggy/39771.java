public void testPutInvalid() {
    common.messages.MessageType message = new common.messages.MessageType("put key ");
    assertFalse(message.isValid);
    assertEquals("Incorrect number of tokens for message put", message.error_msg);
}