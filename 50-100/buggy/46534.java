public final boolean remove(net.named_data.jndn.Name name) {
    boolean wasRemoved = false;
    for (int i = (delegations_.size()) - 1; i >= 0; --i) {
        if ((((net.named_data.jndn.DelegationSet.Delegation) (delegations_.get(i))).name_) == name) {
            wasRemoved = true;
            delegations_.remove(i);
        }
    }
    return wasRemoved;
}