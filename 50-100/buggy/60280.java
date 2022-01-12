public void addNewAccount() {
    org.ethereum.core.Account account = new org.ethereum.core.Account();
    java.lang.String address = org.spongycastle.util.encoders.Hex.toHexString(account.getEcKey().getAddress());
    rows.put(address, account);
    for (org.ethereum.core.Wallet.WalletListener listener : listeners)
        listener.valueChanged();
    
}