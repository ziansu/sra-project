public int autoAuction(Property p, int highestBid) {
    if (highestBid > (getCash()))
        return -1;
    
    while (highestBid <= (1.25 * (p.getBuyPrice())))
        return highestBid + 5;
    
    if (p instanceof NormalProperty) {
        while ((checkMonopoly(((NormalProperty) (p)))) && (highestBid >= (0.9 * (getCash()))))
            return highestBid + 5;
        
    }
    return -1;
}