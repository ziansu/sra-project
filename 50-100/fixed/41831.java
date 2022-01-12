public boolean hasOutputTransaction(de.bitsharesmunich.cryptocoincore.base.GIOTx outputToFind, org.bitcoinj.core.NetworkParameters param) {
    for (de.bitsharesmunich.cryptocoincore.base.GIOTx output : outputTransaction) {
        if ((output.getTransaction().getTxid().equals(outputToFind.getTransaction().getTxid())) && (output.getAddress().getAddressString(param).equals(outputToFind.getAddress().getAddressString(param)))) {
            return true;
        }
    }
    return false;
}