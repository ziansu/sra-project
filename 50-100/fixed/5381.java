@org.junit.Test
public void inLoginShouldVerifyPassShowMessageAndSetStateToMailBoxMenu() {
    when(currentMailbox.checkPasscode("1")).thenReturn(true);
    connection.dial("1");
    connection.dial("#");
    connection.dial("1");
    connection.dial("#");
    assert connection.isInMailBoxMenu();
    phone.speak(ConnectionTestRecording.MAILBOX_MENU_TEXT);
    verify(phone).speak(ConnectionTestRecording.MAILBOX_MENU_TEXT);
}