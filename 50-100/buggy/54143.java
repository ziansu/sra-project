private void simulateLogin() {
    when(display.waitForUserStringInput("Enter your library number: ")).thenReturn("zzz-zzzz");
    when(display.waitForUserStringInput("Enter your password: ")).thenReturn("qwe");
    when(userList.login("zzz-zzzz", "qwe")).thenReturn(new com.twu.biblioteca.Costumer("zzz-zzzz", "qwe", "user1", "email1", "xxx"));
}