private static void Win(java.util.ArrayList<Assignment.Card> hand, java.lang.String player) {
    if ((hand.size()) == 0) {
        java.lang.System.out.println((player + " Wins!\n"));
        Assignment.App.setCurrentTrump(null);
        Assignment.App.setHighestCard((-1.0F));
        Assignment.App.setHighestCardPlayer(null);
    }
}