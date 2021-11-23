@org.junit.After
public void deleteWallet() throws java.lang.Exception {
    issuerWallet.closeWallet().get();
    org.hyperledger.indy.sdk.wallet.Wallet.deleteWallet("issuerWallet", null).get();
    proverWallet.closeWallet().get();
    org.hyperledger.indy.sdk.wallet.Wallet.deleteWallet("proverWallet", null).get();
    pool.closePoolLedger();
}