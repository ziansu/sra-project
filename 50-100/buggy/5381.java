@org.junit.Test
public void inLoginShouldVerifyPassShowMessageAndSetStateToMailBoxMenu() {
    when(currentMailbox.checkPasscode("1")).thenReturn(true);
    connection.dial("1");
    connection.dial("#");
    connection.dial("1");
    connection.dial("#");
    verify(phone).speak(ConnectionTestRecording.MAILBOX_MENU_TEXT);
    assert connection.isInMailBoxMenu();
}