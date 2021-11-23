public static void displayAllGames() {
    Ozlympic.fakeClear();
    java.lang.System.out.println("Final results of all games");
    java.lang.System.out.println("\n*****\nWant to back to main menu?(y or n)");
    java.lang.String s = Ozlympic.input.next();
    while (!(Ozlympic.input.next().equals("y"))) {
        java.lang.System.out.println("\n*****\nWant to back to main menu?(y or n)");
    } 
    java.lang.System.out.println("Back to main menu in 3 seconds...");
}