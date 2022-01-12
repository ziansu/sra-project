public boolean dTurn(team.Player player) {
    if ((((dealer.getSum()) < (player.getSum())) && ((player.getSum()) < 22)) || ((dealer.getSum()) < 17)) {
        java.lang.System.out.println("\nThe dealer hits\n");
        dealerDone = !(dealer.addCard(theDeck.dealNextCard()));
    }else {
        java.lang.System.out.println("\nThe dealer stays\n");
        dealerDone = true;
    }
    return dealerDone;
}