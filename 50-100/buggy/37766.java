public int findCashStoreIndex(sg.edu.nus.iss.vmcs.store.Coin c) {
    super.First();
    while (super.hasNext()) {
        sg.edu.nus.iss.vmcs.store.StoreItem item = super.next();
        if (item != null) {
            sg.edu.nus.iss.vmcs.store.Coin current = ((sg.edu.nus.iss.vmcs.store.Coin) (item.getContent()));
            if ((current.getWeight()) == (c.getWeight())) {
                return super.getCurrent();
            }
        }
    } 
    return -1;
}