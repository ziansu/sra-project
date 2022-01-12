public void receiveBid(double amount, int itemId, server.RegTableEntry entry) {
    if (itemId == (currentItem.getItemId())) {
        if ((currentItem.getCurrentPrice()) < amount) {
            currentItem.setCurrentPrice(amount);
            currentItem.setHighestBidderName(entry.getBidder().getBidderName());
            this.newHighBid();
        }
    }
}