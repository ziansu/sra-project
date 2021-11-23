public void init(java.util.List<org.semux.crypto.EdDSA> keys) {
    accounts.clear();
    for (org.semux.crypto.EdDSA key : keys) {
        accounts.add(new org.semux.gui.Model.Account(key));
    }
}