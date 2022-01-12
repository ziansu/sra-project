private static IUser.UserType authorizeUser(java.lang.String username) {
    IUser.UserType usertype;
    if (!(username.toLowerCase().equals("guest"))) {
        java.lang.System.out.print("Password: ");
        java.lang.String password = platoUI.scanner.next();
        try {
            usertype = platoUI.libControl.login(username, password);
        } catch (java.lang.NullPointerException err) {
            java.lang.System.out.println("\nLogin information was incorrect. Please try again.\n");
            return null;
        }
        return usertype;
    }else
        return IUser.UserType.Customer;
    
}