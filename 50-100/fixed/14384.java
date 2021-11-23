public java.lang.String web3_sha3(java.lang.String data) throws java.lang.Exception {
    java.lang.String s = null;
    try {
        byte[] result = org.ethereum.crypto.HashUtil.sha3(org.ethereum.jsonrpc.TypeConverter.TypeConverter.StringHexToByteArray(data));
        return s = org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(result);
    } finally {
        if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
            org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(((("web3_sha3(" + data) + "): ") + s));
        
    }
}