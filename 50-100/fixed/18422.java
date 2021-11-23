public java.util.List<jota.model.Transaction> replayTransfer(java.lang.String transaction, int depth, int minWeightMagnitude) {
    java.util.List<java.lang.String> bundleTrytes = new java.util.ArrayList<>();
    jota.GetBundleResponse bundle = getBundle(transaction);
    for (jota.model.Transaction element : bundle.getTransactions()) {
        bundleTrytes.add(jota.utils.IotaAPIUtils.transactionTrytes(element));
    }
    return sendTrytes(bundleTrytes.get(0), minWeightMagnitude);
}