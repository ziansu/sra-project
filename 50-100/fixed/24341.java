public void updateStatus() throws java.lang.Exception {
    com.iota.iri.controllers.TransactionRequester.instance().clearTransactionRequest(getHash());
    if (quickSetSolid()) {
    }
    if ((getApprovers().size()) == 0) {
        com.iota.iri.controllers.TipsViewModel.addTipHash(getHash());
    }
}