@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (object instanceof qora.assets.Trade) {
        qora.assets.Trade trade = ((qora.assets.Trade) (object));
        return ((trade.getInitiator().compareTo(this.getInitiator())) == 0) && ((trade.getTarget().compareTo(this.getTarget())) == 0);
    }
    return false;
}