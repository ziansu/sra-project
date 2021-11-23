private void doTile(cs414.a4.n.Player currentPlayer, cs414.a4.n.Tile currentTile, int amountOnDice) {
    switch (currentTile.getType()) {
        case PROPERTY :
        case UTILITY :
        case RAILROAD :
            if (currentTile.hasOwner()) {
                payRent(amountOnDice);
            }else {
                phase = GamePhase.BUY_PROPERTY;
                return ;
            }
            break;
        case TAXES :
            bank.payTax(currentPlayer, currentTile);
            break;
        case GOTOJAIL :
            endTurn();
            return ;
        default :
            break;
    }
    startManagement();
}