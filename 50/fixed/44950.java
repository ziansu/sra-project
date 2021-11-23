public static void displayHand() {
    for (Rummy.Card card : Rummy.Hand.cardsInHand) {
        java.lang.System.out.print(((card.toString()) + " "));
    }
    java.lang.System.out.println();
}