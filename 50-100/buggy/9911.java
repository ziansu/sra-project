@org.junit.Test
public void inMailSystemMenuShouldChangeGreeting() {
    connection.dial("3");
    connection.record("Greeting");
    connection.dial("#");
    org.mockito.Mockito.verify(currentMailbox).setGreeting("Greeting");
    assert connection.isInMailBoxMenu();
    org.mockito.Mockito.verify(phone, times(2)).speak(ConnectionTestMailboxMenu.MAILBOX_MENU_TEXT);
}