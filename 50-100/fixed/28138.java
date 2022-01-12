public static void main(java.lang.String[] args) {
    Woo.cash = 100;
    java.lang.System.out.println((("Welcome to the Cruzse Casino! You currently have " + (Woo.cash)) + "$ in your account"));
    java.lang.System.out.println("What game would you like to play? \n  1. Blackjack ");
    Woo.game = cs1.Keyboard.readInt();
    java.lang.System.out.println();
    if ((Woo.game) == 1) {
        blackjack j = new blackjack(Woo.cash);
        Woo.cash = j.playGame();
    }
}