public int play(GuessingGame game) {
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    java.lang.String title = "Guessing Game";
    java.lang.String prompt = "Your guess? ";
    java.lang.System.out.println(title);
    java.lang.System.out.println(game.getHint());
    int number = 0;
    while (!(game.guess(number))) {
        java.lang.System.out.print(prompt);
        number = scan.nextInt();
        java.lang.System.out.println(game.getHint());
    } 
    java.lang.System.out.println(game.getHint());
    return number;
}