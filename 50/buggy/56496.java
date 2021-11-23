public java.lang.String eth_getUncleCountByBlockHash(java.lang.String blockHash) throws java.lang.Exception {
    org.ethereum.jsonrpc.Block b = getBlockByJSonHash(blockHash);
    long n = b.getUncleList().size();
    return org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(n);
}