public org.ethereum.jsonrpc.SyncingResult eth_syncing() {
    org.ethereum.jsonrpc.SyncingResult s = new org.ethereum.jsonrpc.SyncingResult();
    s.startingBlock = org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(initialBlockNumber);
    s.currentBlock = org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(blockchain.getBestBlock().getNumber());
    s.highestBlock = org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(maxBlockNumberSeen);
    if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
        org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(("eth_syncing(): " + s));
    
    return s;
}