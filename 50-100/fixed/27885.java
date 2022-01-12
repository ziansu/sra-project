public int autoAuction(Property p, int highestBid) {
    if (highestBid > (getCash()))
        return -1;
    
    while ((highestBid <= (1.25 * (p.getBuyPrice()))) && ((getCash()) >= (highestBid + 5)))
        return highestBid + 5;
    
    return -1;
}