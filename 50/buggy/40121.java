private org.sparkbit.jsonrpc.JSONRPCBalance createBitcoinBalance(org.sparkbit.jsonrpc.Wallet w) {
    java.math.BigInteger rawBalanceSatoshi = w.getBalance(Wallet.BalanceType.ESTIMATED);
    java.math.BigInteger rawSpendableSatoshi = w.getBalance(Wallet.BalanceType.AVAILABLE);
    return createBitcoinBalance(w, rawSpendableSatoshi, rawBalanceSatoshi);
}