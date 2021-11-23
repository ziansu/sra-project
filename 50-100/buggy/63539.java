@java.lang.Override
public Auction simulateAuction(java.util.List<Bidder> bidders, double auctionValue) {
    Bidder winningBidder;
    Bidder.sortBiddersByMoneyAscending(bidders);
    while ((bidders.get(0).getMoney()) < auctionValue) {
        auctionValue = biddingRules(auctionValue);
    } 
    winningBidder = winnerDetermination(bidders, auctionValue);
    return new Descending(winningBidder, winningBidder.getMoney(), auctionValue);
}