public void call() {
    if (!(com.bitcoin.termwallet.App.getKit().wallet().isEncrypted())) {
        java.lang.System.out.println("Wallet is not encrypted.");
        return ;
    }
    java.lang.String password = null;
    while (password == null)
        password = com.bitcoin.termwallet.Utils.promptPassword();
    
    com.bitcoin.termwallet.App.getKit().wallet().decrypt(com.bitcoin.termwallet.App.getKit().wallet().getKeyCrypter().deriveKey(password));
    java.lang.System.out.println("Success! Decrypted wallet!");
}