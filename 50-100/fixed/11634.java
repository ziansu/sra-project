private java.lang.Long matchesContract(net.nikr.eve.jeveasset.gui.tabs.contracts.MyContractItem contractItem, boolean add) {
    if (contractItem != null) {
        return matches(add, contractItem.getTypeID(), (contractItem.getContract().isForCorp() ? contractItem.getContract().getIssuerCorpID() : contractItem.getContract().getIssuerID()), null, null, contractItem.getContract().getLocations(), null, null, null, null, contractItem);
    }else {
        return null;
    }
}