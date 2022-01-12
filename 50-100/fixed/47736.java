public boolean runLogin() {
    java.lang.System.out.print("User ID: ");
    java.lang.String userId = scanner.nextLine();
    java.lang.System.out.print("Password: ");
    java.lang.String password = scanner.nextLine();
    try {
        return login(java.lang.Integer.parseInt(userId), password);
    } catch (java.lang.NumberFormatException e) {
        return false;
    }
}