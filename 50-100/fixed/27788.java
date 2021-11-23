public void addBid(mvc.Bid bid) throws mvc.exceptions.NullIDException {
    if (!(bidIDs.contains(bid.getJestID()))) {
        if ((bids) == null) {
            bids = getBids();
        }
        bidIDs.add(bid.getJestID());
        bids.add(bid);
    }
    notifyViews();
}