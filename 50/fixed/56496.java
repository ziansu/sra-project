public java.lang.String eth_getUncleCountByBlockHash(java.lang.String blockHash) throws java.lang.Exception {
    org.ethereum.jsonrpc.Block b = getBlockByJSonHash(blockHash);
    if (b == null)
        return null;
    
    long n = b.getUncleList().size();
    return org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(n);
}