public io.reactivex.Observable<info.blockchain.wallet.payload.data.Wallet> createHdWallet(java.lang.String password, java.lang.String walletName, java.lang.String email) {
    return rxPinning.call(() -> payloadService.createHdWallet(password, walletName, email)).compose(piuk.blockchain.android.data.rxjava.RxUtil.applySchedulersToObservable());
}