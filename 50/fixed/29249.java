public void init(java.util.List<org.semux.crypto.EdDSA> keys) {
    java.util.List<org.semux.gui.Model.Account> list = new java.util.ArrayList<>();
    for (org.semux.crypto.EdDSA key : keys) {
        list.add(new org.semux.gui.Model.Account(key));
    }
    accounts = list;
}