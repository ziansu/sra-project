@org.junit.Test
public void inMessageMenuReturnToMailboxMenu() {
    connection.dial("4");
    assert connection.isInMailBoxMenu();
    java.lang.String MAILBOX_MENU_TEXT = "Enter 1 to listen to your messages\n" + ("Enter 2 to change your passcode\n" + "Enter 3 to change your greeting");
    verify(phone, times(2)).speak(MAILBOX_MENU_TEXT);
}