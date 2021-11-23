public void playAgain() {
    java.lang.System.out.print("Would you like to play another hand? (y/n): ");
    java.lang.String playAgain = Dealer.input.next();
    if (playAgain.equalsIgnoreCase("y")) {
        reset();
        java.lang.System.out.println(("You now have $" + (player.totalMoney)));
        play();
    }else {
        java.lang.System.out.println((("You finished with a total of $" + (player.totalMoney)) + "."));
        java.lang.System.out.println((("Thanks for playing, " + (player.name)) + "! Come back soon."));
        java.lang.System.exit(0);
    }
}