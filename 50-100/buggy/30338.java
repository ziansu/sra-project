public static net.nikr.eve.jeveasset.gui.tabs.transaction.MyTransaction convertTransaction(final com.beimin.eveapi.model.shared.WalletTransaction apiTransaction, final net.nikr.eve.jeveasset.data.Owner owner, final int accountKey) {
    net.nikr.eve.jeveasset.data.Item item = net.nikr.eve.jeveasset.io.shared.ApiIdConverter.getItem(apiTransaction.getTypeID());
    net.nikr.eve.jeveasset.data.MyLocation location;
    if ((apiTransaction.getStationID()) == null) {
        location = new net.nikr.eve.jeveasset.data.MyLocation(0);
    }else {
        location = net.nikr.eve.jeveasset.io.shared.ApiIdConverter.getLocation(apiTransaction.getStationID());
    }
    net.nikr.eve.jeveasset.gui.tabs.transaction.MyTransaction transaction = new net.nikr.eve.jeveasset.gui.tabs.transaction.MyTransaction(apiTransaction, item, location, owner, accountKey);
    return transaction;
}