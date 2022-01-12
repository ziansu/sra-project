public void testGetWithoutParams() {
    com.parse4cn1.command.ParseGetCommand command = new com.parse4cn1.command.ParseGetCommand("users");
    try {
        com.parse4cn1.command.ParseResponse response = command.perform();
        assertFalse(response.isFailed(), "Command should not have failed");
        assertNotNull(response.getJsonObject(), "Non-null reply expected");
    } catch (com.parse4cn1.ParseException ex) {
        assertBool(false, ("An exception occurred: " + (ex.getMessage())));
    }
}