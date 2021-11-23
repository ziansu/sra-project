public java.lang.String eth_getCode(java.lang.String address, java.lang.String blockId) throws java.lang.Exception {
    org.ethereum.jsonrpc.Block block = getByJsonBlockId(blockId);
    if (block == null)
        return null;
    
    byte[] addressAsByteArray = org.ethereum.jsonrpc.TypeConverter.TypeConverter.StringHexToByteArray(address);
    byte[] code = this.repository.getSnapshotTo(block.getStateRoot()).getCode(addressAsByteArray);
    return org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(code);
}