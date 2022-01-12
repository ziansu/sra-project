private static IUser.UserType authorizeUser(java.lang.String username) {
    IUser.UserType usertype;
    if (!(username.toLowerCase().equals("guest"))) {
        java.lang.System.out.print("Password: ");
        java.lang.String password = platoUI.scanner.next();
        usertype = platoUI.libControl.login(username, password);
        return usertype;
    }else
        return IUser.UserType.Customer;
    
}