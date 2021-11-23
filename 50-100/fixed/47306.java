private java.lang.Long matchesMarketOrder(final net.nikr.eve.jeveasset.gui.tabs.orders.MyMarketOrder marketOrder, boolean add) {
    if (marketOrder != null) {
        return matches(add, marketOrder.getTypeID(), marketOrder.getOwnerID(), null, null, marketOrder.getLocation(), null, marketOrder, null, null, null);
    }else {
        return null;
    }
}