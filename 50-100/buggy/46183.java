@java.lang.Override
public void run() {
    android.os.Message message = android.os.Message.obtain();
    appDelegate.saveWalletJSONEnabled = false;
    appDelegate.recoverHDWallet(mnemonicPassphrase, false);
    appDelegate.refreshHDWalletAccounts(true);
    appDelegate.refreshApp(mnemonicPassphrase, false);
    appDelegate.saveWalletJSONEnabled = true;
    handleAfterRecoverWallet(mnemonicPassphrase);
    message.obj = true;
    handler.sendMessage(android.os.Message.obtain(message));
}