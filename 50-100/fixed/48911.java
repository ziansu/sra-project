void saveBid(final net.powermatcher.core.bidcache.AggregatedBid aggregatedBid, final net.powermatcher.api.messages.BidUpdate sentBidUpdate) {
    net.powermatcher.core.concentrator.SentBidInformation info = new net.powermatcher.core.concentrator.SentBidInformation(aggregatedBid, sentBidUpdate);
    synchronized(sentBids) {
        sentBids.add(info);
        if ((sentBids.size()) > (net.powermatcher.core.concentrator.Concentrator.MAX_BIDS)) {
            net.powermatcher.core.concentrator.LOGGER.warn("The number of generated bids is becoming very big, possible memory leak?");
            while ((sentBids.size()) > (net.powermatcher.core.concentrator.Concentrator.MAX_BIDS)) {
                sentBids.removeFirst();
            } 
        }
    }
}