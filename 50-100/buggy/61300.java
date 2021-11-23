public void testPromptYesNoDefault() throws java.lang.Exception {
    org.elasticsearch.cli.MockTerminal terminal = new org.elasticsearch.cli.MockTerminal();
    terminal.addTextInput("");
    assertTrue(terminal.promptYesNo("Answer?", true));
    terminal.addTextInput("");
    assertFalse(terminal.promptYesNo("Answer?", false));
}