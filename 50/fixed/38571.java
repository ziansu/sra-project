@java.lang.Override
public java.lang.String getAddressFromPrivateKey(java.lang.String privateKey) {
    org.bitcoinj.core.DumpedPrivateKey dp = new org.bitcoinj.core.DumpedPrivateKey(org.bitcoinj.params.MainNetParams.get(), privateKey);
    return new org.bitcoinj.core.Address(org.bitcoinj.params.MainNetParams.get(), dp.getKey().getPubKeyHash()).toBase58();
}