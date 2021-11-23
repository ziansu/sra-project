public static void testUpdateAccount(postit.server.controller.DatabaseController db, postit.server.controller.AccountHandler ah, java.lang.String username, java.lang.String pwd, java.lang.String email, java.lang.String fName, java.lang.String lName) {
    boolean res = ah.updateAccount(db, username, pwd, email, fName, lName);
    java.lang.System.out.printf("Updating account %s with %s %s\n", username, pwd, (res ? "successful" : "failed"));
}