private void printAll() {
    java.lang.System.out.println("------Server Data------");
    java.lang.System.out.println(("username: " + (username)));
    java.lang.System.out.println(("password: " + (password)));
    java.lang.System.out.println(("salt: " + (salt)));
    java.lang.System.out.print(("challengeAnswer: " + (challengeAnswer)));
    java.lang.System.out.println("");
    java.lang.System.out.println(("timesToRunHash: " + (timesToRunHash)));
    java.lang.System.out.println(("Hash bit length: " + (HASH_BIT_LENGTH)));
    java.lang.System.out.println("------ENd Server Data--------");
}