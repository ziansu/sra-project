@java.lang.Override
public void onAccountSelected(com.coinomi.core.wallet.WalletAccount account) {
    com.coinomi.wallet.ui.WalletActivity.log.info("Coin selected {}", account.getId());
    openPocket(account);
}