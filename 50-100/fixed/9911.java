@org.junit.Test
public void inMailSystemMenuShouldChangeGreeting() {
    phone.speak(ConnectionTestMailboxMenu.MAILBOX_MENU_TEXT);
    connection.dial("3");
    connection.record("Greeting");
    connection.dial("#");
    org.mockito.Mockito.verify(currentMailbox).setGreeting("Greeting");
    assert connection.isInMailBoxMenu();
    org.mockito.Mockito.verify(phone).speak(ConnectionTestMailboxMenu.MAILBOX_MENU_TEXT);
}