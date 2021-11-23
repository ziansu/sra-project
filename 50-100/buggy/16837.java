@org.junit.Test
public void testCommandExistence() {
    io.hypesquad.watsonbot.WatsonBot.registerCommands();
    final java.lang.String key = "help";
    final io.hypesquad.watsonbot.commands.WatsonHelpCommand value = new io.hypesquad.watsonbot.commands.WatsonHelpCommand();
    org.junit.Assert.assertEquals(java.lang.String.format("Tests if key %s equals %s", key, value.toString()), WatsonBot.commands.get(key), value);
}