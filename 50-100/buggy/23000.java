private boolean processUserChoice(int choice) {
    switch (choice) {
        case 1 :
            dealer.dealSingleCard(player);
            player.reconcileValues();
            player.valuateHand();
            return checkForWin();
        case 0 :
            dealer.dealSingleCard(dealer);
            player.reconcileValues();
            player.valuateHand();
            nextTurn();
            return checkForWin();
    }
    return false;
}