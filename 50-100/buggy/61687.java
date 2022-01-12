public void propertyAction(Property square, Monopoly game) {
    if (((square.getOwner()) == null) && ((square.getOwner()) != (this))) {
        autoBuy(square);
        if ((getCash()) < (square.getBuyPrice()))
            game.auction(square);
        
    }else
        if ((square.getOwner()) != (this))
            pay(square);
        
    
}