private Wallet createWallet(java.lang.String name) {
    Wallet wallet = new Wallet(name);
    wallet.getFrame().setVisible(true);
    Escritorio.add(wallet.getFrame());
    walletList.add(wallet);
    fillCombobox();
    try {
        wallet.getFrame().setSelected(true);
    } catch (java.lang.Exception e) {
    }
    return wallet;
}