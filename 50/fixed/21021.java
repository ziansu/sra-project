@org.junit.After
public void deleteWallet() throws java.lang.Exception {
    this.wallet.closeWallet().get();
    org.hyperledger.indy.sdk.wallet.Wallet.deleteWallet(walletName, null).get();
}