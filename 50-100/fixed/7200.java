@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (object instanceof qora.assets.Trade) {
        qora.assets.Trade trade = ((qora.assets.Trade) (object));
        return (trade.getInitiator().equals(this.getInitiator())) && (trade.getTarget().equals(this.getTarget()));
    }
    return false;
}