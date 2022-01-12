private java.lang.Long matchesTransaction(net.nikr.eve.jeveasset.gui.tabs.transaction.MyTransaction transaction, boolean add) {
    if (transaction != null) {
        return matches(add, transaction.getTypeID(), transaction.getCharacterID(), null, null, transaction.getLocation(), null, null, null, transaction, null);
    }else {
        return null;
    }
}