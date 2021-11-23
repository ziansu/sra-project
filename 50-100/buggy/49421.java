public void saveBid(final net.powermatcher.core.bidcache.AggregatedBid aggregatedBid, final net.powermatcher.api.messages.BidUpdate sentBidUpdate) {
    net.powermatcher.core.concentrator.SentBidInformation info = new net.powermatcher.core.concentrator.SentBidInformation(aggregatedBid, sentBidUpdate);
    synchronized(sentBids) {
        sentBids.add(info);
        if ((sentBids.size()) > (net.powermatcher.core.concentrator.BidHistoryStore.MAX_BIDS)) {
            while ((sentBids.size()) > (net.powermatcher.core.concentrator.BidHistoryStore.MAX_BIDS)) {
                sentBids.removeFirst();
            } 
        }
    }
}