private org.ethereum.jsonrpc.Block getByJsonBlockId(java.lang.String id) {
    if ("earliest".equalsIgnoreCase(id)) {
        return blockchain.getBlockByNumber(0);
    }else
        if ("latest".equalsIgnoreCase(id)) {
            return blockchain.getBestBlock();
        }else
            if ("pending".equalsIgnoreCase(id)) {
                throw new java.lang.UnsupportedOperationException();
            }else {
                long blockNumber = StringHexToBigInteger(id).longValue();
                return blockchain.getBlockByNumber(blockNumber);
            }
        
    
}