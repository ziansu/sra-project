private void settleTransaction(housing.HousingMarket.Offer offer, housing.HousingMarket.Bid bid, double saleprice) {
    bids.remove(bid);
    offers.remove(offer);
}