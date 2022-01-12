public void showHand(com.edu.cnu.poker.Player player) {
    int num = 1;
    java.lang.System.out.println("패 보유 상황");
    for (com.edu.cnu.poker.Card card : player.getPlayerHand().getCardList()) {
        java.lang.System.out.println(((((num + ". 문양 : ") + (card.getSuit())) + " 숫자") + (card.getRank())));
    }
}