public static void resetAccount() {
    java.lang.String[] loginInfo = everythingForTheGame.Main.userLogIn();
    for (java.lang.Integer i = 0; i < (Account.numberOfAccounts); i++) {
        java.lang.String[] compareInfo = everythingForTheGame.Main.gameAccounts[i].getUsernamePassword();
        java.lang.System.out.println("It ran once");
        if (java.util.Arrays.equals(loginInfo, compareInfo)) {
            everythingForTheGame.Main.createAccount(loginInfo[0], loginInfo[1], (i + 1));
            break;
        }
        java.lang.System.out.println("No match found");
    }
}