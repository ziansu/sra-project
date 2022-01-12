public com.blockchain.java.domain.Block createNewBlock(final java.lang.String previousHash, final long proof) {
    final com.blockchain.java.domain.Block block = new com.blockchain.java.domain.Block(((this.chain.size()) + 1), java.lang.System.currentTimeMillis(), this.nextBlockTransactions, proof, previousHash);
    this.nextBlockTransactions.clear();
    this.chain.add(block);
    return block;
}