private void simulateLogin() {
    when(display.waitForUserStringInput("Enter your library number: ", true)).thenReturn("zzz-zzzz");
    when(display.waitForUserStringInput("Enter your password: ", true)).thenReturn("qwe");
    when(userList.login("zzz-zzzz", "qwe")).thenReturn(new com.twu.biblioteca.Costumer("zzz-zzzz", "qwe", "user1", "email1", "xxx"));
}