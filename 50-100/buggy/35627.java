public void onCoinsReceived(org.bitcoinj.core.Wallet wallet, org.bitcoinj.core.Transaction tx, org.bitcoinj.core.Coin prevBalance, org.bitcoinj.core.Coin newBalance) {
    transactions.add(new org.bitcoinj.core.me.sneer.snitcoin.Transaction(Direction.RECEIVE, null, tx.getValue(wallet).toString(), null));
    listener.onChange(new me.sneer.snitcoin.Status(wallet.getBalance().toString(), null, wallet.freshReceiveAddress().toString(), ("Coins Received: " + (tx.getHashAsString()))));
}