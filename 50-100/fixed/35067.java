private static net.nikr.eve.jeveasset.gui.tabs.orders.MyMarketOrder toMarketOrder(final com.beimin.eveapi.model.shared.MarketOrder apiMarketOrder, final net.nikr.eve.jeveasset.data.Owner owner) {
    net.nikr.eve.jeveasset.data.Item item = net.nikr.eve.jeveasset.io.shared.ApiIdConverter.getItem(apiMarketOrder.getTypeID());
    net.nikr.eve.jeveasset.data.MyLocation location = net.nikr.eve.jeveasset.io.shared.ApiIdConverter.getLocation(apiMarketOrder.getStationID());
    return new net.nikr.eve.jeveasset.gui.tabs.orders.MyMarketOrder(apiMarketOrder, item, location, owner);
}