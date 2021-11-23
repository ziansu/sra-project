public synchronized void saveBid(final net.powermatcher.core.bidcache.AggregatedBid aggregatedBid, final net.powermatcher.api.messages.BidUpdate sentBidUpdate) {
    net.powermatcher.core.concentrator.SentBidInformation info = new net.powermatcher.core.concentrator.SentBidInformation(aggregatedBid, sentBidUpdate);
    sentBids.add(info);
    while ((sentBids.size()) > (net.powermatcher.core.concentrator.BidHistoryStore.MAX_BIDS)) {
        sentBids.removeFirst();
    } 
}