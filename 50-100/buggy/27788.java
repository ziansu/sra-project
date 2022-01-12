public void addBid(mvc.Bid bid) throws mvc.exceptions.NullIDException {
    if (!(bidIDs.contains(bid.getJestID()))) {
        bidIDs.add(bid.getJestID());
        if ((bids) == null) {
            bids = getBids();
        }
        bids.add(bid);
    }
    notifyViews();
}