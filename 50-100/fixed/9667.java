public static void main(java.lang.String[] args) {
    SimpleDotCom hans = new SimpleDotCom();
    ReadyBakeInput inny = new ReadyBakeInput();
    boolean isAlive = true;
    java.lang.System.out.println("Hans the dotcom yet lives. Make him run! Enter numbers 0-6 to hit him. 3 consecutive hits will kill him. ");
    while (isAlive == true) {
        java.lang.String playerGuess = inny.getUserInput("Enter a number 0-6: ");
        java.lang.String result = hans.checkYourself(playerGuess);
        java.lang.System.out.println(result);
        if (result == "kill") {
            isAlive = false;
            java.lang.System.out.println("Now, hans must run!");
        }
    } 
}