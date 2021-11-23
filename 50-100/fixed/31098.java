private void dealShoe(com.matthew7j.Shoe shoe) {
    while (!(shoe.yellow)) {
        dealHand(shoe);
        if (!(checkBlackJack())) {
            playerTurn(shoe);
            if (checkTable()) {
                dealerTurn(shoe);
            }
            checkResults();
        }
        checkResults();
        clearTable();
    } 
}