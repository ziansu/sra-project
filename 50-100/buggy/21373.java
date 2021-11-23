@org.junit.Test
public void testAnyCommandBeforeConnect() {
    in.addCommand("help");
    in.addCommand("exit");
    java.lang.String expected = ((((((((greetingMessage()) + "Automatically connection failed! Check if file 'config.properties' is correct") + (integration.IntegrationTest.LINE_SEPARATOR)) + "Invalid data! Your input was help: Try again using next format:") + (integration.IntegrationTest.LINE_SEPARATOR)) + "connect|database|userName|password") + (integration.IntegrationTest.LINE_SEPARATOR)) + "Exiting before connection to database... Good luck!") + (integration.IntegrationTest.LINE_SEPARATOR);
    ua.com.shtramak.controller.Main.main(new java.lang.String[0]);
    org.junit.Assert.assertEquals(expected, getData());
}