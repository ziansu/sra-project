@com.squareup.otto.Subscribe
public void onPriceReceived(com.radiationpressure.mickhardins.mtgrecall.ottoEvents.PriceReceivedEvent e) {
    if (e.getExpansion().equals(mtgCard.getSetName())) {
        this.prices = e.getPrices();
        this.cardprices.setText(prices);
        swipeLayout.setRefreshing(false);
    }
}