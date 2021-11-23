@org.junit.Test
public void testManualConnection() {
    in.addCommand("connect|sqlcmd|postgres|postgres");
    in.addCommand("exit");
    java.lang.String expected = (((((((((greetingMessage()) + "Automatically connection failed! Check if file 'config.properties' is correct") + (integration.IntegrationTest.LINE_SEPARATOR)) + "Hello postgres! Welcome to sqlcmd database") + (integration.IntegrationTest.LINE_SEPARATOR)) + (integration.IntegrationTest.LINE_SEPARATOR)) + "Type a command or 'help' to see the command list") + (integration.IntegrationTest.LINE_SEPARATOR)) + "Good Luck!") + (integration.IntegrationTest.LINE_SEPARATOR);
    ua.com.shtramak.controller.Main.main(new java.lang.String[0]);
    org.junit.Assert.assertEquals(expected, getData());
}