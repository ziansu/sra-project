public com.blockchain.java.domain.Block createNewBlock(final byte[] previousHash, final long proof) {
    final com.blockchain.java.domain.Block block = new com.blockchain.java.domain.Block(((this.chain.size()) + 1), java.lang.System.currentTimeMillis(), new java.util.ArrayList(this.nextBlockTransactions), proof, previousHash);
    this.nextBlockTransactions.clear();
    this.chain.add(block);
    return block;
}