public org.bitcoinj.utils.Fiat getBalanceFiat() {
    return this.exchangeRate.coinToFiat(this.kit.wallet().getBalance());
}