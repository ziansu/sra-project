public void deleteUser() {
    UserDataAdapter userDataAdapter = new UserDataAdapter();
    userDataAdapter.setSessionCookie(cookie);
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String username;
    java.lang.System.out.println("Enter in a username to delete: ");
    username = scanner.nextLine();
    userDataAdapter.DeleteUser(username);
}