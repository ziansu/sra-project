public static java.lang.Boolean doYouWanttoPlay(int maxNumberOfGuesses) {
    java.lang.System.out.println((("You have " + maxNumberOfGuesses) + " guesses to figure out the secret code or you lose the game. Are you ready to play? (Y/N):"));
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    if (input.nextLine().equals("Y")) {
        return true;
    }else {
        return false;
    }
}