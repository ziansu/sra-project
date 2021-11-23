public static void printMenu(com.nguyeningcode.blackjack.Hand hand) {
    java.lang.System.out.println("Please select one of the following options: \n");
    com.nguyeningcode.blackjack.BlackJackUtil.canStay(hand);
    com.nguyeningcode.blackjack.BlackJackUtil.canHit(hand);
    com.nguyeningcode.blackjack.BlackJackUtil.canDoubleDown(hand);
    com.nguyeningcode.blackjack.BlackJackUtil.canSplit(hand);
}