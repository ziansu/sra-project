private boolean matchesMarketOrder(final net.nikr.eve.jeveasset.gui.tabs.orders.MyMarketOrder marketOrder, boolean add) {
    return (marketOrder != null) && (matches(add, marketOrder.getTypeID(), marketOrder.getOwnerID(), null, null, marketOrder.getLocation(), null, marketOrder, null, null, null));
}