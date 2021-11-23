public void propertyAction(Property square, Monopoly game) {
    if (((square.getOwner()) == null) && ((square.getOwner()) != (this))) {
        if ((autoBuy(square)) == (-1))
            game.auction(square);
        
    }else
        if ((square.getOwner()) != (this))
            pay(square);
        
    
}