private boolean matchesTransaction(net.nikr.eve.jeveasset.gui.tabs.transaction.MyTransaction transaction, boolean add) {
    return (transaction != null) && (matches(add, transaction.getTypeID(), transaction.getCharacterID(), null, null, transaction.getLocation(), null, null, null, transaction, null));
}