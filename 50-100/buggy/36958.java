public boolean newBid(com.auction.interfaces.AuctionClientInterface c, com.auction.models.Bid b) {
    com.auction.models.Auction a = auc_by_id.get(b.getAuction_id());
    com.auction.models.Bid highest = a.getHighest_bid();
    if ((b.getValue()) <= (highest.getValue()))
        return false;
    
    a.setHighest_bid(highest);
    addSubscriber(c, a);
    return true;
}