@java.lang.Override
protected java.util.Set<net.nikr.eve.jeveasset.gui.tabs.transaction.MyTransaction> get() {
    if (saveHistory) {
        return new java.util.HashSet<net.nikr.eve.jeveasset.gui.tabs.transaction.MyTransaction>(getOwner().getTransactions());
    }else {
        return new java.util.HashSet<net.nikr.eve.jeveasset.gui.tabs.transaction.MyTransaction>();
    }
}