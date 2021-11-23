public static void showDealersFirstCard(Blackjack.Dealer dealer) {
    if (Blackjack.Card.isCardOver10OrAnAce(dealer.getCard1())) {
        Blackjack.Prompter.showPictureCardName(dealer.getCard1(), "Dealer");
    }else {
        java.lang.System.out.println(("The dealer has the " + (dealer.getCard1())));
    }
}