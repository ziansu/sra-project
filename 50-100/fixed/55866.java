public org.ethereum.jsonrpc.TransactionResultDTO eth_getTransactionByBlockHashAndIndex(java.lang.String blockHash, java.lang.String index) throws java.lang.Exception {
    org.ethereum.jsonrpc.Block b = getBlockByJSonHash(blockHash);
    if (b == null)
        return null;
    
    int idx = JSonHexToInt(index);
    if (idx >= (b.getTransactionsList().size()))
        return null;
    
    org.ethereum.jsonrpc.Transaction tx = b.getTransactionsList().get(idx);
    org.ethereum.jsonrpc.TransactionResultDTO tr = new org.ethereum.jsonrpc.TransactionResultDTO(b, idx, tx);
    return tr;
}