@org.junit.Test
public void testCommandExistence() {
    final java.lang.String key = "help";
    final io.hypesquad.watsonbot.commands.WatsonHelpCommand value = new io.hypesquad.watsonbot.commands.WatsonHelpCommand();
    WatsonBot.commands.put(key, value);
    org.junit.Assert.assertEquals(java.lang.String.format("Tests if key %s equals %s", key, value.toString()), WatsonBot.commands.get(key), value);
}