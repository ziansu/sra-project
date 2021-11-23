private boolean processUserChoice(int choice) {
    switch (choice) {
        case 1 :
            dealer.dealSingleCard(player);
            player.reconcileValues();
            return checkForWin();
        case 0 :
            dealer.dealSingleCard(dealer);
            dealer.reconcileValues();
            nextTurn();
            return checkForWin();
    }
    return false;
}