void checkPassword() throws java.lang.Exception {
    if (ATM.scanner.nextLine().equals(ATM.users.get("password"))) {
        chooseOption();
    }else {
        throw new java.lang.Exception("Sorry, your password is incorrect.");
    }
}